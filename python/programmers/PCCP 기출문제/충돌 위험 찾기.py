from collections import Counter

def solution(points, routes):
    answer = 0
    
    path = []
    
    for route in routes:
        p = []
        for i in range(len(route)-1):
            start_r, start_c = points[route[i]-1]
            end_r, end_c = points[route[i+1]-1]

            if i == 0 : 
                p.append((start_r,start_c))
                
            # r 방향 이동
            if start_r < end_r : 
                for r in range(start_r + 1, end_r + 1):
                    p.append((r, start_c))
            elif start_r > end_r : 
                for r in range(start_r -1 , end_r -1, -1) : 
                    p.append((r, start_c))
            
            # c 방향 이동
            if start_c < end_c : 
                for c in range(start_c + 1, end_c + 1):
                    p.append((end_r, c))
            elif start_c > end_c :
                for c in range(start_c - 1, end_c -1 , -1) :
                    p.append((end_r, c))
                    
            path.append(p)
        
        # 충돌 위험 계산
        max_time = max(len(p) for p in path)
        
        # 최대 이동하는 로봇의 길이만큼 = 모든 로봇이 종착지까지 이동할때까지
        for time in range(max_time) :
            positions = [p[time] for p in path if time < len(p)]
            
            answer += sum(1 for count in Counter(positions).values() if count >= 2)
                    
    return answer


points = [[3, 2], [6, 4], [4, 7], [1, 4]]
routes = [[4, 2], [1, 3], [2, 4]]	
print(solution(points, routes))