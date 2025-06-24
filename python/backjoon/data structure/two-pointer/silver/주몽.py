# 1940

import sys
input = sys.stdin.readline

n= int(input()) # 재료의 개수
m = int(input()) # 갑옷 완성 번호

a = list(map(int, input().split()))
a.sort()

count =0
start = 0
end =  len(a)-1
sum = a[start]+ a[end]

# 1 2 3 4 5 7
while start < end:
    if sum == m:
        count+=1
        sum -= a[start]
        start += 1
        sum += a[start]
    elif sum > m:
        sum -= a[end]
        end -=1
        sum += a[end]
    else:
        sum -= a[start]
        start += 1
        sum += a[start]

print(count)
        