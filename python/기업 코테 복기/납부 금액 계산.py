import math
def solution(array):
    answer = [0] * 13  # 보너스 금액 + 1~12월
    bonus = 0
     
    # 문자열 파싱 월, 금액 , 할부 개월
    for data in array:
        payData = data[0].split()
        month = int(payData[0].split('/')[0])
        price = int(payData[1])
        divide = int(payData[2])

        # 할부 개월이 1인지 확인 후 처리
        if divide == 1 :
            # 1이면 포인트 처리(올림) , 월 저장
            bonus = int(float(math.ceil(price * 0.01)))
            answer[0] += bonus
            answer[month] += price
        # 1아니면 할부 개월 수로 나눈 금액(올림) 월에 저장
        # 만약에 12월에서 3개월 할부면 12, 1, 2이다. 
        else:
            dprice = int(float(math.ceil(price / divide)))
            for m in range(divide):
                dmonth = (month - 1 + m) % 12 + 1
                answer[dmonth] += dprice
    
    for i in range(1, 13):
        if answer[i] == 0:
            answer[i] = -1
    return answer

array  = [
    ["02/05 15000 2"],
    ["03/01 103000 3"],
    ["04/30 30000 4"],
    ["05/01 13000 3"],
    ["06/29 3333 1"],
    ["07/15 80000 1"],
    ["12/31 50000 3"],
    ["11/12 33333 2"],
    ["10/05 20000 1"]
    ]
print(solution(array))