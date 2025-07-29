def solution(numbers):
    answer = 0
    
    from itertools import permutations # 순열 -> 순서가 있는 열. 17,71은 다름
    a= set()
    for i in range(1, len(numbers) + 1):
        for p in permutations(numbers, i): # 1,7,17,71
            a.add(int(''.join(p)))
    
    mx = max(a)
    print(mx)
    
    p = [False, False] + [True] *(mx+1)
    for i in range(2, int(mx ** 0.5) +1):
        if p[i]:
            for j in range(i*i, mx+1, i):
                p[j] = False
    
    answer = sum(1 for n in a if p[n])
            
    
    return answer 