# https://school.programmers.co.kr/learn/courses/30/lessons/340213

from datetime import timedelta
def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    
    v_m, v_s = map(int, video_len.split(":"))
    m, s = map(int, pos.split(":"))
    start_m, start_s = map(int, op_start.split(":"))
    end_m, end_s = map(int, op_end.split(":"))

    video = timedelta(minutes = v_m , seconds = v_s)
    curr = timedelta(minutes = m , seconds = s)
    start = timedelta(minutes = start_m , seconds = start_s)
    end = timedelta(minutes = end_m , seconds = end_s)
    
    
    if start <= curr <= end : 
        curr = end
    
    for command in commands: 
        if command == 'next':
            curr += timedelta(seconds = 10)
        else : 
            if curr < timedelta(seconds = 10):
                curr = timedelta() # 00:00로 
            else:
                curr -= timedelta(seconds = 10)
        # 영상 마지막 위치 체크
        if curr > video:
            curr = video
        # 이동 후에도 영상 범위 내에 있는지 체크
        if start <= curr <= end : 
            curr = end
    
    time = curr.seconds
    mm = str(time // 60).zfill(2)
    ss = str(time % 60).zfill(2)
    
    answer = f"{mm}:{ss}"
    return answer