# https://school.programmers.co.kr/learn/courses/30/lessons/12909

from collections import deque 

def solution(s):
    answer = True
    q = deque()
    l = list(map(str, s.strip()))

    for s in l:
        if s == '(':
            q.append(s)
        else:
            if len(q) == 0:
                return False
            if q[-1] == '(':    
                q.pop()
            else:
                q.append(s)
    
    if len(q) != 0:
        return False    
    return True