# https://school.programmers.co.kr/learn/courses/30/lessons/12899
# 3진법 변형 문제

def solution(n):
    answer = ''
    while n > 0:
        n -= 1                  # 핵심: 자리수를 맞추기 위해 먼저 -1
        answer = '124'[n % 3] + answer
        n //= 3
    return answer