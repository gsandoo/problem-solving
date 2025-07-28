import heapq

def solution(jobs): # [[0, 3], [1, 9], [3, 5]]	
    # 요청 시각 기준 정렬 (먼저 들어오는 작업부터)
    jobs.sort()
    
    n = len(jobs)
    now = 0       # 현재 시각
    idx = 0       # jobs에서 처리한 인덱스
    total_time = 0  # 총 걸린 시간
    pq = []       # 우선순위 큐 (작업 시간 기준)

    while idx < n or pq:
        # 현재 시간까지 들어온 모든 작업을 pq에 넣음
        while idx < n and jobs[idx][0] <= now:
            request_time, duration = jobs[idx]
            heapq.heappush(pq, (duration, request_time))
            idx += 1

        if pq:
            duration, request_time = heapq.heappop(pq)
            now += duration  # 작업 끝나는 시각
            total_time += now - request_time  # 요청 → 종료까지 걸린 시간
        else:
            # 대기 큐가 비었고, 아직 남은 작업이 있다면
            now = jobs[idx][0]  # 다음 작업 시점으로 점프

    return total_time // n  # 평균 시간

print(solution([[0, 3], [1, 9], [3, 5]]	))


# 틀린 이유 : 작업 요청이 들어온 시점에만 :  현재 시간 >= 작업 요청 시각 
# def solution(jobs):
#     answer = 0
    
#     job_length = len(jobs)  
#     a = []
#     for idx, job in enumerate(jobs) :
#         heapq.heappush(a,(job[1], job[0], idx)) # 작업 소요시간, 작업 요청시각, 작업의 인덱스
#         # [(3,0), (5,3), (9,1)]
    
#     b = []
#     while a:
#         curr = heapq.heappop(a)
#         prev_time = curr[1]
#         #(3,0,0) , (6,2,2) , (9,1,1) / 작업 소요시간, 작업 요청시각, 작업의 인덱스
#         start_time = curr[1]
#         # 다음 작업의 시작 시간이 이전 작업 끝나는 시간보다 크다면:
#         if start_time >= prev_time :
#             end_time = curr[0] + curr[1] # 
#             prev_time = end_time
#         else:
#             end_time = prev_time + curr[0] # 마지막 작업 끝난 시간 + 작업 소요 시간 
#             prev_time = end_time
        
#         b.append(end_time-start_time)
    
#     answer = sum(b) // job_length
    
    
#     return answer