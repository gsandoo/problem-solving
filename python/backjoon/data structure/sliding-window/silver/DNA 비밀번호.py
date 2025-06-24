# 12891

import sys
input = sys.stdin.readline

checkList = [0] * 4
myList = [0] * 4
val = 0

def add(c):
    global checkList, myList, val
    if c == 'A':
        myList[0] += 1
        if myList[0] == checkList[0]:
            val +=1
    if c == 'C':
        myList[1] += 1
        if myList[1] == checkList[1]:
            val +=1
    if c == 'G':
        myList[2] += 1
        if myList[2] == checkList[2]:
            val +=1
    if c == 'T':
        myList[3] += 1
        if myList[3] == checkList[3]:
            val +=1

def remove(c):
    global checkList, myList, val
    if c == 'A':
        if myList[0] == checkList[0]:
            val -= 1
        myList[0] -= 1
    if c == 'C':
        if myList[1] == checkList[1]:
            val -= 1
        myList[0] -= 1
    if c == 'G':
        if myList[2] == checkList[2]:
            val -= 1
        myList[0] -= 1
    if c == 'T':
        if myList[3] == checkList[3]:
            val -= 1
        myList[0] -= 1
            
n, m =  map(int, input().split())
a = list(input())
checkList = list(map(int, input().split())) # 1,0,0,1
answer = 0


for i in range(4):
    if checkList[i] == 0:
        val+=1

# {A,C,G,T} -> 1 0 0 1
for i in range(m):
    add(a[i])
    
if val == 4:
    answer +=1

for i in range(m, n):
    j = i - m # 2-2 = 0
    add(a[i])
    remove(a[j])
    if val == 4:
        answer += 1
        
print(answer)