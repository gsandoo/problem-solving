# 12891

import sys 
input = sys.stdin.readline

checkList = [0]*4   # [0,0,0,0]
myList = [0]*4      # [0,0,0,0]
checkSecret = 0 

def myAdd(c):
    global checkList, myList, checkSecret
    if c == 'A':
        myList[0] += 1
        if myList[0] == checkList[0]:
            checkSecret+=1
    if c == 'C':
        myList[1] += 1
        if myList[1] == checkList[1]:
            checkSecret+=1
    if c == 'G':
        myList[2] += 1
        if myList[2] == checkList[2]:
            checkSecret+=1
    if c == 'T':
        myList[3] += 1
        if myList[3] == checkList[3]:
            checkSecret+=1

def myRemove(c):
    global checkList, myList, checkSecret
    if c == 'A':
        if myList[0] == checkList[0]:
            checkSecret-=1
    if c == 'C':
        if myList[1] == checkList[1]:
            checkSecret-=1
    if c == 'G':
        if myList[2] == checkList[2]:
            checkSecret-=1
    if c == 'T':
        if myList[3] == checkList[3]:
            checkSecret-=1

# {A,C,G,T}
n, m = (map(int, input().split()))          # 4 2
a = list(input())                           # GATA
checkList = list(map(int, input().split())) # 1 0 0 1 / {A,C,G,T} 충족 개수 -> A와T는 1씩 있어야 한다.

answer = 0

for i in range(4):
    if checkList[i] == 0:   # 충족 안되도 된다. 즉 C와 G는 슬라이딩 윈도우에 없어도 됨.
        checkSecret += 1    # 변수 +=1

for i in range(m):          # 0~1까지 -> G,A만
    myAdd(a[i])             # 함수는 a[i]를 하나씩 넣으면 myList[i] +=1 씩 후에 checkList와 확인하고 동일하면 checkSecret +=1
    
if checkSecret == 4:        # 4라면 -> 즉 
    answer += 1

for i in range(m,n):        # 2~3까지 -> T,A만
    j = i - m               # 2-2 = 0 / 3-2 = 1 -> 2번 
    myAdd(a[i])             # 2~3번의 인덱스에서 체크 => 새로 슬라이드가 옮기면서 ++
    myRemove(a[j])          # 0~1번 인덱스에서 --  => 슬라이드가 옮겨간 것! 기존의 값은 빠져야 함!
    if checkSecret == 4:
        answer += 1
        
print(answer)

