from collections import defaultdict

def min_infections(n, edges):
    graph = defaultdict(list)
    for u, v in edges:
        graph[u].append(v)
        graph[v].append(u)

    visited = [False] * n
    count = 0

    def dfs(node):
        nonlocal count
        visited[node] = True
        need_infection = False

        for child in graph[node]:
            if not visited[child]:
                infected = dfs(child)
                if not infected:
                    need_infection = True

        if need_infection:
            count += 1
            return True  # 이 노드에 감염지점 설치
        return False

    root_infected = dfs(0)
    if not root_infected:
        count += 1
    return count

n = 10
edges = [
    (0,1),(0,2),(1,3),(2,4),(2,5),(2,6),(3,7),(3,8),(3,9)
]
print(min_infections(n, edges))  # ➜ 출력: 2