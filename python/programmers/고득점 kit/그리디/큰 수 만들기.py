# https://school.programmers.co.kr/learn/courses/30/lessons/42883
# 스택 활용 -> 큰 수를 맨 아래 저장하는 사고
def solution(number, k):
    answer = ''
    
    stack = []
    for num in number:
        while k > 0 and stack and stack[-1] < num:
            stack.pop()
            k-=1
    
        stack.append(num)
    if k > 0 : 
        stack = stack[-k]
    
    answer = ''.join(stack)
    return answer

n ="1924"
print(solution(n,2))