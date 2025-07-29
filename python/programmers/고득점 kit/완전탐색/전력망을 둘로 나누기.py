def solution(n, wires):
    from collections import defaultdict
    answer = float('inf') # max_value

    def dfs(node, visited, graph):
        visited[node] = True
        count = 1
        for nxt in graph[node]:
            if not visited[nxt]:
                count += dfs(nxt, visited, graph)
        return count
    
    
    for i in range(len(wires)):
        temp = wires[:i] + wires[i+1:] # 하나씩 끊어보기
        a = defaultdict(list)
        visited = [False] *(n+1)
        # 인접리스트 
        for t in temp : 
            s,e = t
            a[s].append(e)
            a[e].append(s)
                
        count = dfs(1, visited, a)
        mn = abs((n-count) - count) # (전체-(temp)) - temp 즉 전선 하나 잘라서 (나머지 - 떨어진 것)
        answer = min(answer, mn)
    
    return answer
