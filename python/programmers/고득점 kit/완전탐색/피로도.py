from itertools import permutations # 순열
def solution(k, dungeons):
    answer = -1
    
    for p in permutations(dungeons) : 
        cnt = 0
        fatique = k 
        for limit, energy in p:
            if limit <= fatique : 
                fatique -= energy
                cnt += 1
            else : 
                break
        answer = max(answer, cnt)     