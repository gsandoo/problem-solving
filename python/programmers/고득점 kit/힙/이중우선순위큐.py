# https://school.programmers.co.kr/learn/courses/30/lessons/42628
import heapq
def solution(operations):
    min_pq = []
    max_pq = []
    
    visited = dict()
    id = 0
    
    for op in operations : 
        command, num = op.split()
        num = int(num)
        
        if command =='I':
            heapq.heappush(min_pq, (num, id))
            heapq.heappush(max_pq, (-num,id)) # 최대 힙
            visited[id] = True # 해당 인덱스 유효 처리
            id += 1
        else : 
            # 삭제 연산인데 힙이 비어있음 skip하기
            if num == 1:
                while max_pq and not visited[max_pq[0][1]]: # max_pq[0][1] 값은 id 값
                    heapq.heappop(max_pq)
                if max_pq:
                    visited[max_pq[0][1]] = False
                    heapq.heappop(max_pq)
            else:
                while min_pq and not visited[min_pq[0][1]]:
                    heapq.heappop(min_pq)
                if min_pq:
                    visited[min_pq[0][1]] = False
                    heapq.heappop(min_pq)

    
    #동기화 정리 후 최종 최대 최소 값 추출
    while max_pq and not visited[max_pq[0][1]]:
            heapq.heappop(max_pq)
    while min_pq and not visited[min_pq[0][1]]:
            heapq.heappop(min_pq)
    
    if not min_pq or not max_pq:
        return [0, 0]

    return [-max_pq[0][0], min_pq[0][0]]  # [최댓값, 최솟값]

print(solution(["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]))