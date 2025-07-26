def solution(name):
    answer = 0
    length = len(name)

    # 1. 상하 조이스틱 이동 계산
    for char in name:
        # JAZ로 치자면 J>A까지 9번 + A는 PASS + Z는 Z>A = 1번
        up_down = min(ord(char) - ord('A'), ord('Z') - ord(char) + 1) # J - A , Z-J + 1 
        answer += up_down

    # 2. 좌우 이동 계산 (최솟값을 찾아야 함)
    move = length - 1  # 최대 이동 수는 그냥 끝까지 가는 것 > 2번 / J -> A(1) -> Z(2)

    for i in range(length): # 3 / 0~2
        next_idx = i + 1 # 1 / 2 / 3
        # 다음 문자가 A인 구간을 찾는다
        while next_idx < length and name[next_idx] == 'A':
            next_idx += 1 # 만약 JAAAAAAZ면 = idx : 1일때 A면 J까지 계속 증가 
        # i까지 왔다가 뒤로 돌아가는 경우 vs 그냥 끝까지 가는 경우 중 최소
        move = min(move, i + length - next_idx + min(i, length - next_idx)) # 2, 0+3-2 +(0)

    answer += move
    return answer



name = 'JAZ'
print(solution(name))