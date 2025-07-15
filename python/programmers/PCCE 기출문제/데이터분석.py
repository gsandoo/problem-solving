# https://school.programmers.co.kr/learn/courses/30/lessons/250121


def solution(data, ext, val_ext, sort_by):
    # data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, 
    # sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
    dict = {
        "code" : 0,
        "date" : 1,
        "maximum" : 2,
        "remain" : 3
    }
    e_idx = dict[ext]
    s_idx = dict[sort_by]
    answer = []          
    
    for line in data : 
        if line[e_idx] < val_ext :
            answer.append(line)
    
    answer.sort(key = lambda x : x[s_idx]) # key = lambda 활용법 good, 2차원 리스트의 특정 열을 기준으로 정렬 
    return answer