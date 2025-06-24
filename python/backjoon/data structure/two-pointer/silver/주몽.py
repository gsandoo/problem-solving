# 1940

import sys
input = sys.stdin.readline

n= int(input()) # 재료의 개수
m = int(input()) # 갑옷 완성 번호

a = list(map(int, input().split()))
a.sort()

count =0
start = 0
end =  n-1

# 1 2 3 4 5 7
while start < end:
    if a[start] + a[end] > m:
        end-=1
    elif a[start] + a[end] < m:
        start +=1
    else:
        count+=1
        start +=1
        end -=1
print(count)
        