# https://school.programmers.co.kr/learn/courses/30/lessons/42587
from collections import deque

def solution(priorities, location):
    answer = 0
    q = deque([(p,idx) for idx, p in enumerate(priorities)])
    
    while len(q)!= 0:
        cur = q.popleft()
        if any(cur[0] < other[0] for other in q):
            q.append(cur)
        else:
            answer += 1
            if cur[1] == location : 
                return answer
