# https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=python3
def solution(phone_book):
    answer = True
    d = dict()
    for phone_num in phone_book : 
        d[phone_num] = True 
    for phone_num in phone_book : 
        for i in range(1, len(phone_num)):
            if phone_num[:i] in d :
                return False
    return answer

def solution(phone_book):
    answer = True
    phone_book.sort() # 정렬을 해야 됨
    for i in range(len(phone_book) - 1):
        if phone_book[i+1].startswith(phone_book[i]):
            return False
    return answer