def solution(x, y, n):
    dp = [float('inf')] * (y + 1)
    dp[x] = 0

    for i in range(x + 1, y + 1):
        if i - n >= x : 
            dp[i] = min(dp[i], dp[i-n]+1)
        if i % 2 == 0 and i // 2 >= x :
            dp[i] = min(dp[i], dp[i//2] + 1)
        if i % 3 == 0 and i // 3 >= x :
            dp[i] = min(dp[i], dp[i//3] + 1)

    return -1 if dp[y] == float('inf') else dp[y]

print(solution(10,40,5))

