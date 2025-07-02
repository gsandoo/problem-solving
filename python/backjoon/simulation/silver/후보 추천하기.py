n = int(input())
m = int(input())
arr = list(map(int, input().split()))

frame = []  # 사진틀: (학생번호, 추천수, 시간)
student_dict = {}  # 학생번호: [추천수, 시간]

for time, student in enumerate(arr):
    # 중복 추천일 때 -> 추천 수 추가
    if student in student_dict:
        student_dict[student][0] += 1 # 추천 수 추가
    # 사진이 꽉 찼을 때
    if len(frame) == n:
        frame.sort(key= lambda x: (x[0], x[1])) # 
        delete_student = frame.pop(0)
        del student_dict[delete_student[0]]
    # 꽉 차지 않았을 때는 새로 사진틀에 넣기
    student_dict[student] = [1, time]
    frame.append((student, 1, time))
    
    # 사진 틀에 추천 수 update
    for i in range(frame):
        if frame[i][0] == student:
            frame[i] = (student, student_dict[student][0], student_dict[student][1])    

answer = sorted([x[0] for x in frame]) # frame의 학생번호를 기준으로 오름차순 정렬
print(*answer)