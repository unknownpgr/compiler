from random import shuffle
rule = {
    'S': ['_bool', '_exp'],
    'op_bool': ['>', '<', '=='],
    'op_number': ['+', '-', '*', '/'],
    'exp': ['( _exp )', '_number', '_exp _op_number _exp'],
    'number': ['1', '2', '3', '4', '5', '6', '7', '8', '9', '_number _number', '_number 0'],
    'bool': ['_exp _op_bool _exp']
}

'''
    생각해보자.
    일단 어떤 문자열이 acceptable한가를 따지는 것은 그래프 탐색으로 볼 수 있다.
    DFS로는 최대한 terminal이 없는 쪽으로 가도록 할 수 있다. 그러나 이 방법이 언제까지나 유효한 것 또한 아니다.

    인수분해를 해 보자.
    number => number number | number 0
    => number = number ( number | 0)
    let     number_t = number | 0
    then    number = number number_t
    이게 끝인데?

    음
    일단 위 machine을 state machine처럼 나타낼 수 있는가?
    => 가능하다.

    연산을 엄밀하게 정의해보자.
    문자열 규칙을 정의하자.
    룰은 대문자로, 알파벳은 소문자로 쓴다.
    룰은 다음과 같다.
    A=>aB
    A=>Ba
    A=>aBa
        이것은
        A=>a(Ba)
        let C=>Ba
        A=>aC
        C=>Ba
    A=>B
    A=>C
    이면 A=>B|C로 쓴다.

    A=>B
    B=>C이면

    A=>C이다.
    A=>BC

    A=>A이면
    A=oo이다.

    A=>Aa이면
    A=>oo이다.

    A=>Aa|B이면
    A=>Ba*이다.
    
    A=>aA|B이면
    A=>a*B이다.

    BC|BD이면
    B(C|D)이다.
    
    B|C|D이면
    B|(C|D)이다.

    즉 concatnating은 곱셈(교집합)과 성질이 비슷하고, or 연산은 덧셈(합집합)과 성질이 비슷하다.
    예컨대
    a*(b+c)=ab+ac
    이므로
    B(C|D) 이면
    BC|BD이다.

    또한 | 연산은 순서를 바꿀 수 있다.
    A|B이면 B|A이다.

    그렇지만 concatenating은 그렇지 못하다.
    그러므로 행렬 곱과도 비슷하다.

    A[k] = CONCAT i from 0 to k A
    ex) A[3] => AAA
    (A|B)[k] = CONCAT i from 0 to k A|B
    근데 이게 이렇게 되면
    (A|B)[2]=>(A|B)(A|B) 인가 AA|BB인가? 헷갈리네?
    생각해보니 전자가 맞는다.

    A* = OR i from 0 to inf A[i]
    :. (A|B)* = OR i from 0 to inf (A|B)[i]
    :. (A|B)* = OR i from 0 to inf (A|B)[i]

    A|A = A이다.
    (A|A*) = A*이다.
    A*의 정의가
    B=>BA|
    이면
    B=>A*이다.

    A*|=A*
    |A*=A*

    |A+=A*
    A+|=A*

    즉, A+이다 A*는 |과 단항연산하면 A*가 되고,

    A|A+=A+
    A+|A=A+

    AA*=A+
    A*A=A+

    A와 이항연산하면 A+이 된다.

    A+A+!=A+
    A+A+=AA+=AAA*
    A*A*=A*

    A|A*=A*

    이제 재귀를 풀 수 있다.
    N=>d|NN|N0
    :.N=>d|N(N|0)
    :.N=>N(N|0)|d
    :.N=>NA|d / A=>N|0
    :.N=>dA* / A=>N|0
    :.N=>d(N|0)*
    
    :.A=>dA*|0
    :.A=>d(A|A*)|0
    :.A=>dA|dA*|0
    dA*=B
    :.A=>dA|(B|0)
    :.A=>d*(B|0)
    :.A=>d*(dA*|0)

    A=>A*|B라면?
    A=>|B*=B*이다.

    A=>aA*|B라면?
    
    :.A=>dA|(dA*|0)
    :.A=>d*(dA*|0)
    :.A=>d*dA*|d*0
    :.A=>d+A*|d*0

    여기서 증명하고 싶은 바는 무엇인가?
    A=>aA*|b라면
    A=>(a(a|b)*b)|b임을 보이고 싶다.
    a(a|b)*=B라 두면
    A=>Bb|b=(B|)b
    그러므로 A=>(a(a|b)*|)b
    그러므로 A=>Bb
    B=>aC
    C=>(a|b)*b
    C=>C(a|b)
    ...
    아모른직다...
'''


def is_terminal(s):
    return s[0] != '_'


def gen(s, maxdepth=3, depth=0):
    r = ''
    for t in s.split(' '):
        if is_terminal(t):
            r += t
        else:
            nt = []
            tm = []
            for t in rule[t[1:]]:
                if '_' not in t:
                    tm.append(t)
                else:
                    nt.append(t)
            shuffle(tm)
            shuffle(nt)
            if depth > maxdepth:
                if len(tm) > 0:
                    r += gen(tm[0], maxdepth, depth+1)
                else:
                    r += gen(nt[0], maxdepth, depth+1)
            else:
                if len(nt) > 0:
                    r += gen(nt[0], maxdepth, depth+1)
                else:
                    r += gen(tm[0], maxdepth, depth+1)
    return r


def acceptable(s, t, depth=1):
    if is_terminal(t):
        print(' '*depth+s+'='+t)
        return s == t
    else:
        r = False
        for t_ in rule[t[1:]]:
            print(' '*depth+s+'='+t_)
            if r:
                return r
            if ' 'in t_:
                if len(s) == 1:
                    return False
                f = s[0]
                b = s[1:]
                ft = t_[:t_.index(' ')]
                bt = t_[t_.index(' ')+1:]
                r |= acceptable(f, ft, depth+1) & acceptable(b, bt, depth+1)
            else:
                r |= acceptable(s, t_, depth+1)
        return r


print(acceptable('12', '_S'))
