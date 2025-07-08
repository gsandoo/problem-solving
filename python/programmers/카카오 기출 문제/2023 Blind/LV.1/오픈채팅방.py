
def getNickname(data, uid):
    return data[uid][0]

def solution(record):
    answer = []
    
    data = {} 
    
    # 최신 정보로 저장
    for r in record : 
        if r.split()[0] != 'Leave':
            command, uid, nickname = map(str, r.split())
            data[uid] = [nickname]
            
    for r in record : 
        if r.split()[0] == 'Leave':
            command, uid = map(str, r.split(' '))
            org_nickname = getNickname(data, uid)
            answer.append(org_nickname + "님이 나갔습니다.")
        else:
            command, uid, nickname = map(str, r.split(' '))
            if command == 'Enter':
                org_nickname = getNickname(data, uid)
                answer.append(org_nickname + "님이 들어왔습니다.")
            
    return answer