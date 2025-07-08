# https://school.programmers.co.kr/learn/courses/30/lessons/150369

# cap	n	deliveries	            pickups	                result
#  4	5	[1, 0, 3, 1, 2]	        [0, 3, 0, 4, 0]	        16
#  2	7	[1, 0, 2, 0, 1, 0, 2]	[0, 2, 0, 1, 0, 2, 0]	30
def solution(cap, n, deliveries, pickups):
    answer = 0
    d_idx = n - 1
    p_idx = n - 1

    while d_idx >= 0 or p_idx >= 0:
        # 배달, 수거 중 가장 먼 거리 찾기
        while d_idx >= 0 and deliveries[d_idx] == 0:
            d_idx -= 1
        while p_idx >= 0 and pickups[p_idx] == 0:
            p_idx -= 1

        # 더 먼 쪽 거리 기준으로 이동
        farthest = max(d_idx, p_idx)
        if farthest < 0:
            break

        answer += (farthest + 1) * 2 # 배달, 수거 중 더 먼거리의 값을 저장 => 가까운 곳은 왔다갔다 총 4번해야 함. 가장 먼 거리는 2번 

        # 배달 로직
        d_cap = cap
        i = d_idx
        while i >= 0 and d_cap > 0:
            if deliveries[i] == 0:
                i -= 1
                continue
            if deliveries[i] <= d_cap:
                d_cap -= deliveries[i]
                deliveries[i] = 0
                i -= 1
            else:
                deliveries[i] -= d_cap
                d_cap = 0
        d_idx = i  # 다음 루프에서 처리할 위치 갱신

        # 수거 로직
        p_cap = cap
        i = p_idx
        while i >= 0 and p_cap > 0:
            if pickups[i] == 0:
                i -= 1
                continue
            if pickups[i] <= p_cap:
                p_cap -= pickups[i]
                pickups[i] = 0
                i -= 1
            else:
                pickups[i] -= p_cap
                p_cap = 0
        p_idx = i  # 다음 루프에서 처리할 위치 갱신

    return answer
