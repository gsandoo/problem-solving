# 2750
import sys
input = sys.stdin.readline

n = int(input())
a = list()

for _ in range(n):
    a.append(int(input()))

# 버블 정렬 반복문(암기)    
for i in range (n-1): # 0~3
    for j in range(n-1-i): # 5-1-0 = 4 , 0~3
        if a[j] > a[j+1]:
            tmp = a[j]
            a[j] = a[j+1]
            a[j+1] = tmp

for i in range(n):
    print(a[i])