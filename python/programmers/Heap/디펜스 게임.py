def solution(n, k, enemy):
    import heapq
    answer = 0
    q = []
    
    for i  in range(len(enemy)):
        heapq.heappush(q, - enemy[i])
        n -= enemy[i]
        
        if n < 0:
            if k == 0:
                return i
            else:
                e = -heapq.heappop(q)
                n += e
                k-=1

    return len(enemy)