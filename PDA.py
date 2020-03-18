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

P = {
    '#T': ['a', 'b', 'c', 'k #K'],
    '#W': ['#T', '#T #W'],
    '#S': ['#T', '#W', '( #S )', '#S #S'],
    '#K': ['#K', 'a #K'],  # This rule never terminates.
    '#P': ['#S', '#S #W']  # This symbol is not accessible
}

P = {
    '#S': ['a #S', '#A', '#B'],
    '#A': ['a #A'],
    '#B': ['a'],
    '#C': ['a a']
}


def convert_to_tuples(P):
    tuples = []
    for key in P:
        for value in P[key]:
            tuples.append((key, value.split(' ')))
    return tuples


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


Pt = convert_to_tuples(P)
print(Pt)
Pt = terminating_rule(Pt)
print(Pt)
Pt = accessible_rule(Pt, '#S')
print(Pt)
