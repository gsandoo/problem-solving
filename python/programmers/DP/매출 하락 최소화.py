# https://school.programmers.co.kr/learn/courses/30/lessons/72416

# 트리 구조의 조직에서 일부 직원이 세미나에 참여함
# ✔️ 부하 중 한 명이라도 참석하면 그 상사는 참석 안 해도 됨
# ❗ 하지만 상사가 불참하면 부하 중 최소 1명은 반드시 참석해야 함

def solution(sales, links):
    answer = 0
    
    #dp 배열 초기화
    n = len(sales)
    sales = [0] + sales  # 1번부터 맞추기 위해 앞에 0 추가
    dp = [[0, 0] for _ in range(n + 1)] # 해당 노드가 참석 안했을 때 최소 비용 / 해당 노드가 참석 했을 때 최소 비용  
    
    
    # 트리 만들기 + 진입차수 세기(루트 노드를 알기 위해)
    from collections import defaultdict
    tree = defaultdict(list)
    ind = [0] * (n+1)
    for parent, child in links : 
        tree[parent].append(child)
        ind[child] += 1 
    print(tree)
    
    # dfs
    def dfs(node):
        dp[node][0] = 0 # 불참
        dp[node][1] = sales[node] # 참석
        
        # 리프 노드 -> 자식x
        if not tree[node] : 
            return
        
        total = 0
        must_attend = float('inf') # 자식 중 1명을 반드시 참석시켜야 할 때의 최소 손해
        for child in tree[node]:
            dfs(child) # 후위 순회, 자식 노드의 불참/참 여부의 값을 먼저 찾기
                                                                                                                                                                    
            # 참석 시: 자식은 자유롭게 선택 가능
            dp[node][1] += min(dp[child][0], dp[child][1])
            
            # 불참 시: 자식 중 최소 1명은 참석해야 함
            total += min(dp[child][0], dp[child][1]) # 해당 자식이 참/불참 비용 중 최소 비용 선택
            
            diff = dp[child][1] - min(dp[child][0], dp[child][1]) # 자식의 참여 비용 - (참/불참 비용 중 최소 비용)
            must_attend = min(must_attend, diff) 
            
        # 자식 중 하나는 반드시 참석시켜야 하는 조건 반영
        if must_attend > 0:
            dp[node][0] = total + must_attend
        else:
            dp[node][0] = total
    
    # 루트 노드 찾기
    root = next(i for i in range(1, n+1) if ind[i] == 0)
    # DFS 시작
    dfs(root)
    
    answer = min(dp[root][0], dp[root][1])
    
    return answer

print(solution([10, 10, 1, 1]	,[[3,2], [4,3], [1,4]]	 ))

    