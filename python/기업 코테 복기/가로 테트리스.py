import heapq

def solution(inputs):
    result = []
    
    for blocks in inputs:
        width = blocks[0]          # 가로 넓이
        block_list = blocks[1:]    # 블록 길이 목록

        heap = []  # min-heap: 층별 남은 공간

        for block in block_list:
            if heap:
                # 가장 적은 남은 공간부터 시도
                remaining = heapq.heappop(heap)
                if remaining >= block:
                    # 블록을 해당 층에 쌓음
                    heapq.heappush(heap, remaining - block)
                else:
                    # 해당 층엔 못 쌓고 다시 넣고 새 층 생성
                    heapq.heappush(heap, remaining)
                    heapq.heappush(heap, width - block)
            else:
                # 첫 층 생성
                heapq.heappush(heap, width - block)
        
        result.append(len(heap))  # 층의 수 = 힙의 크기
    
    return result
