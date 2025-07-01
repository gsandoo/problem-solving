# 20436

# 키보드
qwerty = [
    ['q', 'w', 'e', 'r', 't','y','u','i','o','p'],
    ['a','s','d','f','g','h','j','k','l'],
    ['z','x','c','v','b','n','m']
    ]

# dictionary 자료 구조로 저장
pos = {}
for i in range(3):
    for j in range(len(qwerty[i])):
        pos[qwerty[i][j]] = (i , j)

n, m = map(str, input().split())
zoac = input()

left = pos[n] 
right = pos[m]

# 자판 기준(왼손 오른손)
Lkey = set("qwertasdfgzxcv")
Rkey = set("yuiophjklbnm")

# 이동할 때마다 거리 + 1 / 클릭 시 비용 +1
cost = 0 
distance = 0
for ch in zoac:
    if ch in Lkey:
        distance += abs(left[0] - pos[ch][0]) + abs(left[1] - pos[ch][1])
        cost += 1
        left = pos[ch]
    else :
        # 오른손에 있다는 뜻
        distance += abs(right[0] - pos[ch][0]) + abs(right[1] - pos[ch][1])
        cost += 1
        right = pos[ch]

print(distance + cost)