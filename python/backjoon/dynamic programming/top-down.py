import sys
input = sys.stdin.readline

n = int(input())
d = [-1] *(n+1)

d[0] = 0
d[1] = 1

def fibo(N):
    if d[N] != -1:
        return d[N]
    d[N] = fibo(N-1) + fibo(N-2)
    return d[N]

fibo(n)
print(d[n])

        
    