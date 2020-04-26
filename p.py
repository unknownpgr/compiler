def c(*ss):
    '''
    Cartesian product of given sets.
    '''
    def t(*ls):
        if len(ls) == 1:
            r = []
            for i in ls[0]:
                r.append((i,))
        else:
            s = t(*(ls[1:]))
            r = []
            for i in ls[0]:
                for j in s:
                    r.append((i,)+j)
        return tuple(r)
    return list(t(*ss))


def p(o):
    def t(o):
        '''
        Print tuple-set structure.
        List is considered a set and tuple is considered a tuple.
        d is a parameter for recursive call. it should be 0.
        '''
        if type(o) is list:
            c = ','.join(map(t, o))
            c = '{'+c+'}'
        elif type(o) is tuple:
            c = ','.join(map(t, o))
            c = f'({c})'
        else:
            c = o
        return c
    print(t(o))


'''
Below is an example of using this code.
'''
A = ['a', 'b', 'c']
B = ['x', 'y', 'z']
C = ['p', 'q', 'r']
p(c(A, c(B, C)))
p(c(c(A, B), C))
p(c(A, B, C))
