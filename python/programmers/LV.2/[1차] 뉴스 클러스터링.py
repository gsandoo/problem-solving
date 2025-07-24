# https://school.programmers.co.kr/learn/courses/30/lessons/17677

from collections import Counter
def solution(str1, str2):
    
    def make_multiset(str):
        multiset = []
        str = str.lower() # 모두 소문자로
        for i in range(len(str) - 1) : 
            pair = str[i:i+2] # 2개씩 잘라서
            if pair.isalpha(): # 모두 문자라면
                multiset.append(pair)
        return multiset
    
    answer = 0
    
    m_str1 = make_multiset(str1) # ['FR', 'RA', 'AN', 'NC', 'CE']
    m_str2 = make_multiset(str2) # ['FR', 'RE', 'EN', 'NC', 'CH']
    
    counter1 = Counter(m_str1) # [('FR' : 1), ('RA' : 1) ...]
    counter2 = Counter(m_str2)
    
    # 교집합, 합집합 만들기
    inter = counter1 & counter2 # [('FR' : 1), ('NC' : 1)]
    full = counter1 | counter2 
    
    i_size= sum(inter.values()) # 1+1 = 2
    f_size = sum(full.values())
    
    if f_size == 0:
        return 65536
    
    similarity = int((i_size/f_size) * 65536)
    
    answer = similarity

    return answer

s1 = "E=M*C^2	"
s2 = "e=m*c^2	"
print(solution(s1,s2))