from random import shuffle

'''
푸시다운 오토마타에 대해 이해해보자.
푸시다운 오토마타는 FDA와 비슷한 것이나,
FDA와는 다르게 행동이 현재 입력 심벌과 스택의 top 요소에 의해 결정된다.

푸시다운 오토마타는 아래 7개의 요소로 이뤄진다.
P=(Q,S,G,d,q0,z0,F)
Q : 상태들의 유한 집합
S : 입력 심벌들의 유한 집합
G : 스택 심벌의 유한 집합
d : 사상 함수 Qx(SU{e})xG->Q,G*
q0 in Q : 시작 상태
z0 in G : 스택의 시작 심벌
F  in Q : 종결 상태들의 집합

!. 위 정의에서 스택 심벌과 입력 심벌이 나눠져있는 것으로부터 스택 심벌과 입력 심벌이 서로 다를 수 있음을 알 수 있다.
!. 위 정의에서 사상 함수는 현재 상태, 스택의 상태, 공집합을 포함한 
!. 위 정의에서 d의 출력에 심볼이나 방향 요소가 없었다. 즉 PDA는 튜링 머신과는 다르게 테이프의 내용을 바꿀 수 없고, 항상 한칸씩 우측으로만 이동한다.
!. 그런데 스택에서 원소를 뽑는 연산이 왜 없을까? 항상 하나씩 뽑나?
!. 
'''


'''
# means nonterminal.
if you want to describe #, use \\# instead.
'''

'''Epsilon symbol. It is just an empty string.'''
EPSILON = ''
'''Below is an e'''
f'Here is #a_an {EPSILON} empty string!'

P = {
    '#T': ['a', 'b', 'c', 'k #K'],
    '#W': ['#T', '#T #W'],
    '#S': ['#T', '#W', '( #S )', '#S #S'],
    '#K': ['#K', 'a #K'],  # This rule never terminates.
    '#P': ['#S', '#S #W']  # This symbol is not accessible
}

P = {
    '#S': ['#A #B c #D'],
    '#A': [''],
    '#B': [''],
    '#D': [''],
}


def convert_to_tuples(P):
    tuples = []
    for nonterminal in P:
        for value in P[nonterminal]:
            tuples.append((nonterminal, value.split(' ')))
    return tuples


'''
The form of rule is a tuple of (nonterminal,list of symbols).
'''


def terminating_rule(P):
    # Terminating ruels.
    terminating = []

    while True:
        ntlen = len(terminating)
        for rule in P:
            if rule[0] in terminating:
                continue

            for symbol in rule[1]:
                # If given rule is both nonterminal and have some nonterminating symbol
                if symbol[0] == '#' and symbol not in terminating:
                    break
            else:
                # If every symbol in string is terminating nonterminal or termial
                terminating.append(rule[0])

        # Check if terminating symbol is changed
        if ntlen == len(terminating):
            break

    # Check if given rule has nonterminating symbol
    def check_terminating(rule):
        if rule[0] not in terminating:
            return False
        for symbol in rule[1]:
            if symbol[0] == '#' and symbol not in terminating:
                return False
        return True

    # Return terminating rule
    return list(filter(check_terminating, P))


def accessible_rule(P, starting_symbol):
    accessible = [starting_symbol]

    while True:
        accLen = len(accessible)

        for rule in P:
            # If current rule is accessible
            if rule[0] in accessible:
                for symbol in rule[1]:
                    # If current symbol is nonterminal
                    if symbol[0] == '#' and symbol not in accessible:
                        accessible.append(symbol)

        if accLen == len(accessible):
            break

    def check_accessible(rule):
        if rule[0] not in accessible:
            return False
        for symbol in rule[1]:
            if symbol[0] == '#' and symbol not in accessible:
                return False
        return True

    # Return terminating rule
    return list(filter(check_accessible, P))


'''
이제 non-terminating이나 non-accessible한 rule을 모두 제거하였으므로, e-생성 규칙을 제거하여 e-free문법으로 만드려 한다.
e-생성 규칙이란 A->e 꼴의 규칙을 말한다.
또한 어떤 규칙이 nullable이란 A-*>e꼴임을 말한다.
어떤 규칙이 e-생성 규칙이면 당연히 nullable이며, 그렇지 않을 경우 우변이 모두 nullable nonterminal이면 nullable이다.
쓰다 보니 symbol의 nullable과 규칙의 nullable이 섞였다. 주의하자. 서로 다른 개념이다.

먼저 nullable nonterminal인 집합 Ne와, e-생성 규칙이 아닌 규칙들의 집합 P를 만든다.
그리고 P의 각 원소, 즉 각 e-생성 규칙이 아닌 규칙들에 대하여,
'nullable한 nonterminal심볼들 중 하나 이상을 제거하여 만들 수 있는 가능한 모든 규칙'을 P에 추가하면 된다.

예를 들어 어떤 규칙이 A->BCdE라고 하자. 이때 B, C, E는 nullable이었다.
그렇다면 nullable 심볼 중 하나 이상을 제거한 심볼은 다음과 같다.

A->

하나만 제거한 경우
CdE
BdE
BCd

두 개를 제거한 경우
Bd
Cd
dE

세 개를 제거한 경우
d
'''


def e_free(P, start_symbol, new_start_symbol='#S_'):
    def get_nullable_nonterminal(P):
        nullable_nonterminal = []
        while True:
            nnLen = len(nullable_nonterminal)
            for rule in P:
                for symbol in rule[1]:
                    if symbol not in nullable_nonterminal and symbol is not EPSILON:
                        break
                else:
                    if rule[0] not in nullable_nonterminal:
                        nullable_nonterminal.append(rule[0])
            if nnLen == len(nullable_nonterminal):
                return nullable_nonterminal

    def get_selection(n):
        '''
        Get array of available selection except selecting all element
        for example, for n=3, it returns:
        [
            [F,F,F],
            [F,F,T],
            [F,T,F],
            [F,T,T],
            [T,F,F],
            [T,F,T],
            [T,T,F]
        ]
        (T=True, F=False)
        '''

        k = 2**n
        selection = []
        for i in range(k-1):
            l = []
            while i > 0:
                l.append(True if i % 2 is 1 else False)
                i //= 2
            for i in range(n-len(l)):
                l.append(False)
            selection.append(list(reversed(l)))
        return selection

    def get_non_e_generate_rule(P):
        P_ = []
        for rule in P:
            for symbol in rule[1]:
                if symbol is not EPSILON:
                    P_.append(rule)
                    break
        return P_

    # Non-epsilon-generate rules
    P_ = get_non_e_generate_rule(P)

    # nullable nonterminals
    nullable_nonterminals = get_nullable_nonterminal(P)

    # Append new rules to P_
    P_new = []
    for rule in P_:

        # Get indexes of nullable nonterminals.
        nullable_indexes = []
        for i in range(len(rule[1])):
            if rule[1][i] in nullable_nonterminals:
                nullable_indexes.append(i)

        # Generate all available selection
        selections = get_selection(len(nullable_indexes))
        # Generate new rules by removing one or more nullable nonterminals.
        for selection in selections:
            symbols_new = []
            for i in range(len(rule[1])):
                if i in nullable_indexes and not selection[nullable_indexes.index(i)]:
                    continue
                symbols_new.append(rule[1][i])
            P_new.append((rule[0], symbols_new))

    # Check if start symbol is nullable
    if start_symbol in nullable_nonterminals:
        new_start = new_start_symbol
        P_new.append((new_start, [start_symbol, '']))
    else:
        new_start = start_symbol

    return P_+P_new, new_start


P, new_start = e_free(convert_to_tuples(P), '#S')
for rule in P:
    print(rule)
exit(0)

Pt = convert_to_tuples(P)
print(Pt)
Pt = terminating_rule(Pt)
print(Pt)
Pt = accessible_rule(Pt, '#S')
print(Pt)
