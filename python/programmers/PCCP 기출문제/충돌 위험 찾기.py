from collections import Counter

def solution(points, routes):
    # 각 로봇의 전체 경로를 시간순으로 저장
    robot_paths = []
    
    for route in routes:
        path = []
        
        # 첫 번째 지점부터 시작
        for i in range(len(route) - 1):
            start_r, start_c = points[route[i] - 1]
            end_r, end_c = points[route[i + 1] - 1]
            
            # 현재 위치 (첫 번째 구간이 아니라면 시작점 제외)
            if i == 0:
                path.append((start_r, start_c))
            
            # r 방향 먼저 이동
            if start_r < end_r:
                for r in range(start_r + 1, end_r + 1):
                    path.append((r, start_c))
            elif start_r > end_r:
                for r in range(start_r - 1, end_r - 1, -1):
                    path.append((r, start_c))
            
            # c 방향 이동
            if start_c < end_c:
                for c in range(start_c + 1, end_c + 1):
                    path.append((end_r, c))
            elif start_c > end_c:
                for c in range(start_c - 1, end_c - 1, -1):
                    path.append((end_r, c))
        
        robot_paths.append(path)
    
    # 충돌 위험 계산
    collision_count = 0
    max_time = max(len(path) for path in robot_paths)
    
    for time in range(max_time):
        # 현재 시간에 각 로봇의 위치 수집
        positions = [path[time] for path in robot_paths if time < len(path)]
        
        # 2개 이상 로봇이 있는 위치의 개수 계산
        collision_count += sum(1 for count in Counter(positions).values() if count >= 2)
    
    return collision_count