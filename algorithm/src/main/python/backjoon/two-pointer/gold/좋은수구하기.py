import sys
input = sys.stdin.readline

n = int(input()) # 10
a = list(map(int, input().split())) # 1 2 3 4 5 6 7 8 9 10

answer = 0
a.sort()

for k in range (n): # 0~9
    start = 0 
    end = n-1 # 9
    find = a[k] # 1
    while start < end :
        if a[start] + a[end] == find :
            if start != k and end != k:
                answer +=1 
                break
            elif start == k:
                start += 1
            elif end == k:
                end -= 1
        elif a[start] + a[end] < find :
            start += 1
        else :
            end -=1

print(answer)
         

