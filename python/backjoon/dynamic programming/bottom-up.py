import sys
input = sys.stdin.readline

n = int(input())
d = [-1] *(n+1)

d[0] = 0
d[1] = 1

for i in range(2, n+1):
    d[i] = d[i-2] + d[i-1]
    
print(d[n])