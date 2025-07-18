# https://school.programmers.co.kr/learn/courses/30/lessons/43165

def solution(numbers, target):
    answer = 0
    count = 0 
    def DFS(level, sum) : 
        nonlocal count
        if level == len(numbers) :
            if sum == target:
                count += 1 
        else :
            DFS(level + 1, sum + numbers[level])
            DFS(level + 1, sum - numbers[level])
        return count
    
    answer = DFS(0, 0)
    

    return answer


num = [1, 1, 1, 1, 1]	
target = 3
print(solution(num, target))