# https://school.programmers.co.kr/learn/courses/30/lessons/72411

from itertools import combinations
from collections import Counter
def solution(orders, course):
    
    answer = []
    
    # course[i] 길이 만큼 orders[i] 가지고 조합 만들기
    for c in course : 
        li = []
        
        for order in orders:
            sorted_order = sorted(order) # "ABCFG" -> ["A", "B", "C", "F", "G"]로 오름차순 정렬 후 리스트로 반환
            combi = combinations(sorted_order , c)
            li += combi
        # 조합의 개수를 셈    
        counter = Counter(li)
        
        if counter : 
            max_cnt = max(counter.values())
            if max_cnt >= 2: # course[i] 길이 이상인 orders[i] 조합의 길이가 2개 이상인지 확인  
                for menu, cnt in counter.items():
                    if cnt == max_cnt : 
                        answer.append(''.join(menu)) # 리스트를 문자열로 변환. ["a" , "b" , "c"] -> "abc"
        
    answer = sorted(answer)
    return answer


