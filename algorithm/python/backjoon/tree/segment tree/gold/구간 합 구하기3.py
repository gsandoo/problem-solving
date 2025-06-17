# 2042

import sys 
input = sys.stdin.readline

n,m,k = map(int, input().split())

treeHeight = 0 
length = n

# 1.1 treeHeight 구하기 2^k >= n
while length != 0:
    length //= 2 # 5 // 2 = 2
    treeHeight +=  1 
    
treeSize = pow(2, treeHeight + 1) # 공식 : 2^k * 2 = 2^k+1
leftNodeStartIndex = treeSize // 2 - 1 # 16 // 2 -1 = 8 - 1 = 7

tree = [0] * (treeSize + 1) # 1차원 리스트. 0~16

# 1.2 데이터를 리프 노드에 저장
for i in range(leftNodeStartIndex + 1 , leftNodeStartIndex + n + 1):
    tree[i] = int(input()) # 8 ~ 13 -> 8,9,10,11,12 인덱스에 값 삽입
    

# 인덱스 트리 생성 함수
def setTree(i):
    while i != 1:
        tree[i//2] += tree[i]
        i -= 1

setTree(treeSize -1)

# 값 변경 함수
def changeVal(idx , val): # 10 6
    diff = val - tree[idx] # 6 - 3 = 3
    while idx > 0:
        tree[idx] = tree[idx] + diff # 3 + 3 = 6 -> 시작점 + 3 번의 노드를 6의 값으로 바꿔라
        idx = idx // 2

# 질의값 구하는 함수(여기선 구간합)        
def getSum(s,e):
    partSum = 0 
    while s <= e: # end_index < start_index가 될때까지
        if s % 2 == 1: # start_index % 2 == 1일때는 해당 노드 선택
            partSum += tree[s]
            s+=1 # depth 변경 (1)
        if e % 2 == 0: # end_index % 2 == 0일때는 해당 노드 선택
            partSum += tree[e]
            e-=1 # depth 변경 (1)
        s = s // 2 # depth 변경 (2)
        e = e // 2 # depth 변경 (2)
    return partSum


for _ in range(m+k):
    q, s, e = map(int, input().split()) # 1 3 6
    if q == 1:
        changeVal(leftNodeStartIndex+ s, e) # 10, 6
    elif q == 2:
        s = s + leftNodeStartIndex
        e = e + leftNodeStartIndex
        print(getSum(s,e))
        