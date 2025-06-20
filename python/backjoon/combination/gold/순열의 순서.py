# 1722

#input
# 4
# 1 3

# 4
# 2 1 3 2 4

# output
# 1 3 2 4

# 3

# 핵심 : 1~N까지의 수의 순열 경우의 수는 N!개다. 
# 예: N=4 면 4!개의 순열을 가짐 -> 4*3*2*1 = 24개를 가진다
import sys
input = sys.stdin.readline

F = [0] * 21 # 자리별로 만들 수 있는 경우의 수 저장하기 -> 팩토리얼 형태
S = [0] * 21 # 순열을 담는 리스트
visited = [False] * (21)

n = int(input())

F[0] = 1

# 팩토리얼 초기화 -> 각 자리에서 만들 수 있는 경우의 수. 4 = 4! = 24
for i in range(1, n+1):
    F[i] = F[i-1] * i


inputList = list(map(int, input().split()))

# 순열을 구할 경우
if inputList[0] == 1:
    K = inputList[1]
    for i in range(1, n+1):
        cnt = 1
        for j in range(1, n+1):
            if visited[j]:
                continue
            if K <= cnt * F[n-i]: # F[3] -> F[2] -> F[1]
                K -= (cnt- 1) * F[n-i]
                S[i] = j
                visited[j] = True
                break
            cnt+=1
    for i in range(1, n+1):
        print(S[i], end = ' ')
else:
    K = 1 
    for i in range(1, n+1):
        cnt = 0
        for j in range(1, inputList[i]):
            if not visited[j]:
                cnt += 1
        K += cnt * F[n-i]
        visited[inputList[i]] = True
    print(K)





