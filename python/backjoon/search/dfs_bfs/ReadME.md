# DFS (깊이우선탐색) 알고리즘
- 그래프 완전 탐색 기법 중 하나 
- 재귀 함수 이요용하므로 스택-오버플로 유의
- 한 번 방문한 노드는 다시 재방문 안하므로 방문 배열 필수

## 핵심 이론
1. 초기 작업 - 인접 리스트로 그래프 표현, 방문 리스트 초기화, dfs(0,0) 시작

2. 스택에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 스택에 삽입하기

3. 스택 자료구조에 값이 없을 때까지 반복하기
