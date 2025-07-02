n = int(input())
m = int(input())
arr = list(map(int, input().split()))

frame = []  # 사진틀: (학생번호, 추천수, 시간)
student_dict = {}  # 학생번호: [추천수, 시간]

for t, student in enumerate(arr):
    if student in student_dict:
        student_dict[student][0] += 1  # 추천수 +1
    else:
        if len(frame) == n:
            # 가장 추천 적고, 오래된 사람 제거
            frame.sort(key=lambda x: (x[1], x[2]))  # 추천수, 시간 순 정렬
            remove_student = frame.pop(0)
            del student_dict[remove_student[0]]
        student_dict[student] = [1, t]
        frame.append((student, 1, t))
    # 추천 수 업데이트
    for i in range(len(frame)):
        if frame[i][0] == student:
            frame[i] = (student, student_dict[student][0], student_dict[student][1])
            break

# 오름차순 정렬
answer = sorted([x[0] for x in frame])
print(*answer)
