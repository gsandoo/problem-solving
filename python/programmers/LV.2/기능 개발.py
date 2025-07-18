# https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=python3

from collections import deque
import math
def solution(progresses, speeds):
    answer = []
    q= deque()
    # 프로그레스 별로 math.ceil(( 100 - progress[i] ) / speed[i])
    for i in range(len(progresses)):
        q.append(math.ceil(( 100 - progresses[i] ) / speeds[i]))
    
    # 큐에서 하나 값을 꺼내고 다음 값보다 작다면 그대로 1 처리 
    # 크다면 작아질 때까지 1추가 해서 answer에 저장
    while q:
        count = 1
        num = q.popleft()
        while q and num >= q[0] :
            q.popleft()
            count += 1
        answer.append(count)
  
    return answer