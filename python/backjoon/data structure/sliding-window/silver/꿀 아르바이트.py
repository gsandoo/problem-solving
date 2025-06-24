# 12847
import sys
input= sys.stdin.readline

n, m = map(int, input().split())
a = list(map(int, input().split()))

window = sum(a[:m]) # a[0]~a[2] 
answer = window 

# 슬라이딩 윈도우
for i in range(m,n):
    tmp_window = window - a[i-m] + a[i]
    answer = max(answer, tmp_window)
    window = tmp_window

print(answer)
