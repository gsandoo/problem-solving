# https://school.programmers.co.kr/learn/courses/30/lessons/42626

import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    
    while scoville[0] < K and len(scoville) >= 2:
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        nxt = first + (second * 2)
        heapq.heappush(scoville, nxt)
        answer += 1
    return answer if scoville[0] >= K else -1

