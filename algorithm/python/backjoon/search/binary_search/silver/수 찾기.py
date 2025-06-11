# 1920

import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int,input().split()))

m = int(input())
b = list(map(int,input().split()))

# 이진 탐색
a.sort()


for i in b:
    start = 0 
    end = len(a) - 1
    while(start <= end):
            mid = (start + end) // 2
            if a[int(mid)] < i:
                start = mid + 1
            elif a[int(mid)] > i :
                end = mid - 1
            else :
                print(1)
                break
    else:
        print(0)
            