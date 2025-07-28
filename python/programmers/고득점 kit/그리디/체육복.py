def solution(n, lost, reserve):
    answer = 0
    
    real_lost = list(set(lost) - set(reserve)) # [2,4] /  [2, 3, 4] 일 때  4만 남음
    real_reserve = list(set(reserve) - set(lost))
    
    cloth = [1] * (n+2) 
    
    for res in real_reserve : 
        cloth[res] +=1
        
    for loss in  real_lost : 
        cloth[loss] -= 1 # 체육복 잃어버림
    

    for i in range(1, n+1) :
        if cloth[i] == 0:
            if cloth[i-1] == 2:
                cloth[i] += 1
                cloth[i-1] -= 1
            elif cloth[i+1] == 2:
                cloth[i] += 1
                cloth[i+1] -= 1
            
    for i in range(1,n+1):
        if cloth[i]:
            answer += 1
        
    return answer
