# 최소 공통 조상(Lowest Common Ancestor)
- 트리 그래프에서 임의의 두 노드를 선택했을 때 두 노드가 각각 자신을 포함해 거슬러 올라가면서 부모노드 탐색
- 이 때 처음 공통으로 만나게 되는 조상 찾는 알고리즘

## 자료구조
> 인접리스트 
```[[]for _ in (n+1)]```

## 핵심 이론
> 두 노드의 깊이를 맞춰 주거나 같아지는 노드를 찾을 때 두 노드가 같은지 비교
> bfs, dfs로 구현이 가능하다

1. 인접리스트에 그래프 데이터 저장
2. bfs 구현 
    - deque에 넣기
    - visited 처리
    - level(트리 깊이), now_size(현재 깊이에서 트리 크기), count 정의
    - for 문 -> 미방문시 큐에 넣고 방문처리
    > 부모 배열에 부모 노드 저장
    > 뎁스 배열[next]에 level 저장
    > count +=1 , 
    > count == tree_size이면(레벨 다 돌면)
    > count = 0 , tree_size = len(queue) , level += 1 
3. LCA 구현
    - a < b 면:
    > a,b = b,a (a 값을 항상 더 깊은 뎁스를 가지는 노드로)
    - depth[a] < depth[b]면:
    > a = parent[a]  (a노드를 이전 레벨)
    - depth[a] != depth[b]면: (두 노드가 레벨은 같은데 부모 노드가 다르면 둘 다 이전 레벨)
    > a = parent[a] 
    > b = parent[b]
    - 리턴 a
      

