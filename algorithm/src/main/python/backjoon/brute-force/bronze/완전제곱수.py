M = int(input())
N = int(input())

sum = 0
min = 0

for i in range (1,101) :
    if M <= i*i <= N:
        if sum == 0:
            min = i*i
        sum += i*i

if sum == 0:
    print(-1)
else:
    print(sum)
    print(min)

