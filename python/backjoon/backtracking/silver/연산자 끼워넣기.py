# 14888
import sys
input = sys.stdin.readline

n = int(input())  # 수의 개수
nums = list(map(int, input().split()))  # 수열
ops = list(map(int, input().split()))   # 연산자 개수: + - * //

max_result = -float('inf')
min_result = float('inf')

def dfs(level, current_result, plus, minus, mul, div):
    global max_result, min_result
    
    if level == n:
        max_result = max(max_result, current_result)
        min_result = min(min_result, current_result)
        return

    num = nums[level]

    # + 사용
    if plus > 0:
        dfs(level + 1, current_result + num, plus - 1, minus, mul, div)
    # - 사용
    if minus > 0:
        dfs(level + 1, current_result - num, plus, minus - 1, mul, div)
    # * 사용
    if mul > 0:
        dfs(level + 1, current_result * num, plus, minus, mul - 1, div)
    # / 사용 (음수 처리 주의)
    if div > 0:
        if current_result < 0:
            dfs(level + 1, -(-current_result // num), plus, minus, mul, div - 1)
        else:
            dfs(level + 1, current_result // num, plus, minus, mul, div - 1)

# DFS 시작: 첫 번째 수부터 탐색 시작
dfs(1, nums[0], ops[0], ops[1], ops[2], ops[3])

# 결과 출력
print(max_result)
print(min_result)
