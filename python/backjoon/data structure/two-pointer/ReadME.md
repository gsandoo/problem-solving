# two-pointer 알고리즘
> 2개의 포인터를 이용해 시간 복잡도를 최적화
> 연속된 자연수 합, 구간 탐색 등 다양한 용도로 활용
- 다양한 문제풀이를 통해 개념 숙지 및 활용 연습 필요.

## 핵심 이론
1. 사용 변수 초기화
``` start = 1, end = 1, sum = 1, count = 1 ```

2. 루프 돌며 구간 탐색
```python 
    while end != n : # 배열의 끝까지 탐색  
        if sum == n: # 답을 찾았다면
            count += 1
            end += 1
            sum += end
        elif sum > n: # start 지점을 옮기면서 연속합-배열[start] 하기
            sum -= start
            start += 1
        else: # end 옮기면서 연속합 시키기
            end +=1
            sum +=end
```