# 2018
import sys
input = sys.stdin.readline

n= int(input())

count = 0
start = 1
end = 1
sum = 1


while end != n:
    if sum == n:
        count += 1
        sum -= start
        start += 1
    elif sum > n:
        sum-= start
        start +=1
    else:
        end+=1
        sum+=end

print(count+1)
        