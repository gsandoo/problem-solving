def solution(n, money):
    answer = 0
    mod = 1_000_000_007
    dp = [1] + [0] * n 
    
    for coin in money  : 
        for price in range(coin, n + 1) : 
            dp[price] += dp[price - coin] 
    
    answer = dp[n] % mod
    return answer

print(solution(5,[1,2,5]))