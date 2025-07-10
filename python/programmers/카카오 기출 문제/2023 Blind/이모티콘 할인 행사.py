# https://school.programmers.co.kr/learn/courses/30/lessons/150368

def solution(users, emoticons):
    answer = [0,0]
    data = [10,20,30,40]
    discount = []
    
    def dfs(level, tmp):
        if level == len(tmp):
            discount.append(tmp[:]) # 배열 전부 저장
            return 
        else:
            for i in data :
                tmp[level] += i
                dfs(level + 1, tmp)
                tmp[level] -= i
    
    dfs(0, [0] *len(emoticons))
    
    # 만들어진 모든 조합을 하나씩 살펴보기
    for d in discount: 
        cnt = 0
        get = 0
        for i in users:
            pay = 0
            for j in range(len(d)):
                if i[0] <= d[j]:
                    pay += emoticons[j] * (100 - d[j]) / 100
                if pay >= i[1]:
                    break
            if pay >= i[1]: # 만약 유저의 제한금액 초과시 플러스 구매
                pay = 0
                cnt += 1
            get += pay
        if cnt >= answer[0]:
            if cnt == answer[0]:
                answer[1] = max(answer[1], get)
            else:
                answer[1] = get
            answer[0] = cnt
    return answer