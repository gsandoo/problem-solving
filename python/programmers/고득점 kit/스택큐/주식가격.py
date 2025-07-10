# https://school.programmers.co.kr/learn/courses/30/lessons/42587
from collections import deque

def solution(prices):
    answer = [0] * len(prices)
    q = deque()

    for i in range(len(prices)): # 0 ~ 4 / 1,3,2,2,3
        # 가격이 떨어진 시점을 만나면 계산 후 pop
        while q and prices[i] < prices[q[-1]]:
            j = q.pop()
            answer[j] = i - j # [0,1,0,0,0]
        q.append(i) # 0, 2, 3, 4

    # 끝까지 가격이 떨어지지 않은 경우 처리
    while q:
        j = q.pop() # 4
        answer[j] = len(prices) - 1 - j # [4,1,2,1,0]

    return answer

prices = [1,2,3,2,3]

print(solution(prices))