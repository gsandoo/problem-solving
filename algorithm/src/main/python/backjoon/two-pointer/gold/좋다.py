# 1253 

import sys
input = sys.stdin.readline

n = int(input()) # 10
a = list(map(int, input().split())) # 1 2 3 4 5 6 7 8 9 10

answer = 0
a.sort()

for k in range (n) :
    i = 0 
    j = n-1 
    find = a[k]
    while i < j :
        if a[i] + a[j] == find :
            if i != k and j != k :
                answer +=1 
                break
            elif i == k:
                i += 1
            elif j == k :
                j -= 1
        elif a[i] + a[j] < find :
            i += 1
        else :
            j -= 1
            
print(answer)
         

