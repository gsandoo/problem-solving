# https://school.programmers.co.kr/learn/courses/30/lessons/64065

def solution(s):
    answer = []
    s = s[2:-2]
    
    p = s.split('},{')
    
    arr = list(list(map(int, pt.split(',')))for pt in p)
    
    arr.sort(key = len)
    
    st = set()
    for a in arr : # [[2], [2,1], [2,1,3]...]
        for i in a : 
            if i not in st:
                st.add(i)
                answer.append(i)

    return answer
