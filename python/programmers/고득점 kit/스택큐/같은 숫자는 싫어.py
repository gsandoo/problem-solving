# https://school.programmers.co.kr/learn/courses/30/lessons/12906

from collections import deque

def solution(arr):
    answer = []
    q = deque()

    for n in arr:
        if len(q) == 0:
            q.append(n)
        else:
            if n != q[-1]:
                q.append(n)

    q.reverse()
    while len(q) != 0:
        answer.append(q.pop())
    
    return answer

arr = [1,1,3,3,0,1,1]
print(solution(arr))