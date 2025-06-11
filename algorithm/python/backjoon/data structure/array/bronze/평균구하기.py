# 1546
N = int(input())
M = list(map(int, input().split()))

max = max(M) # 80
sum = sum(M) # 180

print(sum * 100 / max / N)
    