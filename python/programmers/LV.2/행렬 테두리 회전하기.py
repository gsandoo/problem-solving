# https://school.programmers.co.kr/learn/courses/30/lessons/77485?language=python3

# 2,2,5,4 -> 3,3, 4,3
# 3,3,6,6 -> 4,4, 4,5, 5,4, 5,5


# (1,1), (1,2) , (1,3), (2,3), (3,3), (4,3) , (4,2) (4,1) (3,1) (2,1)

def solution(rows, columns, queries):
    answer = []
    
    # 2차원 배열 만들기
    arr = [[x for x in range(i*rows+1, i*rows+rows+1)]for i in range(columns)]
    
    # for i in range(columns):
    #     for j in range(rows):
    #         print(arr[i][j], end = ' ')
    #     print()
    
    for q in queries : 
        startx,starty,endx,endy = q
        startx -=1
        starty -=1
        endx-=1
        endy-=1
        
        tmp = arr[startx][starty]
        m = arr[startx][starty]
        for i in range(starty+1,endy+1): # 3~3 -> 2까지
            tmp2=arr[startx][i]
            arr[startx][i] = tmp
            m = min(m, tmp)
            tmp = tmp2
        
        for i in range(startx+1,endx+1): # 2,5 -> 2~4까지
            tmp2=arr[i][endy] # 2,4 / 
            arr[i][endy] = tmp
            m = min(m, tmp)
            tmp = tmp2
            
        for i in range(endy-1,starty-1,-1): # 2~0 -> 2~1까지
            tmp2=arr[endx][i] # 4,2  
            arr[endx][i] = tmp
            m = min(m, tmp)
            tmp = tmp2
            
        for i in range(endx-1,startx-1,-1): # 3~0 -> 3~1까지
            tmp2=arr[i][starty]
            arr[i][starty] = tmp
            m = min(m, tmp)
            tmp = tmp2
    
        answer.append(m)
    return answer

r = 3
c = 3
q = [[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]]
print(solution(r,c,q))