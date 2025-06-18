# 1541

import sys
input = sys.stdin.readline

a = list(map(str, input().split('-')))

def mySum(i):
    sum = 0
    tmp = str(i).split('+')
    for i in tmp :
        sum += int(i)
    return sum

answer = 0 
for i in range(len(a)):
    tmp = mySum(a[i])
    if i == 0:
        answer += tmp
    else:   
        answer -= tmp
        
print (answer)