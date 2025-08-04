# 📌 문제 설명
# 특정 사용자의 친구 목록과 전체 유저의 친구 관계가 주어졌을 때, 공통 친구 수를 기준으로 친구 추천 목록 상위 3명을 반환하세요.

# 이미 친구인 유저는 추천하지 않음

# 공통 친구 수가 같다면, 사전순으로 먼저 오는 유저를 우선


def solution(user, friends):
    from collections import defaultdict
    my_f = set(friends[user])
    counter = defaultdict(int)
    
    for other, other_f in friends.items():
        if other == user : 
            continue
        for f in other_f:
            if f in my_f:
                counter[other] += 1
    
    recommend = []

    for name, score in counter.items():
        if name not in my_f and name != user:
            recommend.append((score, name))  

    # 공통 친구 수 내림차순, 이름 오름차순 정렬
    recommend.sort(key=lambda x: (-x[0], x[1]))

    # 이름만 뽑아서 최대 3개 추천
    result = [name for _, name in recommend[:3]]
        
    
    return result


user = "alice"
friends = {
    "alice": ["bob", "carol"],
    "bob": ["alice", "david"],
    "carol": ["alice", "david", "eric"],
    "david": ["bob", "carol"],
    "eric": ["carol"]
}
print(solution(user, friends))
