def solution(brown, yellow):
    answer = []
    total = brown + yellow # 12
    for height in range(3,total):
        if total % height != 0:
            continue 
        width = total // height  # 4
        if (width -2) * (height - 2) == yellow: # 2
            return [width, height]
    