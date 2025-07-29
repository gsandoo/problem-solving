def solution(word):
    answer = []
    alpha = ['A', 'E', 'I', 'O', 'U']
    def dfs(word):
        if len(word) >5 :
            return
        if word : 
            answer.append(word)
        for ch in alpha: 
            dfs(word + ch) # A, AA, AAA, AAAA, AAAAA, AAAAE, AAAAI, ...
    
    dfs('')
    return answer.index(word) + 1