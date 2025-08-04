# 📌 문제 설명
# 문자열이 주어졌을 때, 연속으로 반복되는 문자를 압축해서 출력하는 프로그램을 작성하세요.
# 압축 형식은:
# a3b2c1 → a가 3번, b가 2번, c가 1번 나왔다는 의미입니다.

# 단, 압축 결과가 원래 문자열보다 길 경우, 원래 문자열을 그대로 반환하세요.

def solution(word):
    from collections import Counter
    answer = ""
    a= Counter(word)
    
    hs = set()
    for w in word:
        if w not in hs : 
            answer += w + str(a[w])
            hs.add(w)
        
    if len(word) < len(answer):
        return word
    return answer    
print(solution("aaabbcddd"))