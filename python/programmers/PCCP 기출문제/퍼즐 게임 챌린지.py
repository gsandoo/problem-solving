# https://school.programmers.co.kr/learn/courses/30/lessons/340212
def solution(diffs, times, limit):
    
    L, R = 1, max(diffs)
    answer = R
    
    while L <= R :
        diff = (L+R) // 2
        sum = 0
        for i in range(len(diffs)):
            if diff >= diffs[i] : 
                sum += times[i]
            else :
                t = diffs[i] - diff
                prev_time = times[i - 1] if i != 0 else 0
                sum += (prev_time + times[i]) * t + times[i]
            
        if sum <= limit:
            R = diff-1
            answer = diff
        else:
            L = diff + 1            
    return answer
