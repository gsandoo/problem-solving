from itertools import permutations

def solution(expression):
    answer = 0
        
    # 1. 연산자 순열 만들기
    oper = set()
    for op in expression : 
        if op in '*-+' :
            oper.add(op)
            
    # 2. 연산자 순열 리스트 생성
    li_oper = list(permutations(oper))
    
    # 3. 숫자랑 연산자랑 분리
    def parse(expr) : 
        result = []
        num = ''
        for ch in expr :
            if ch in '*-+':
                result.append(int(num)) # 숫자 넣고
                result.append(ch) # 그 다음 부호 넣고
                num = ''
            else: 
                num += ch
        result.append(int(num))
        return result
    
    parse_expr = parse(expression)
    
    # 4. 우선 순위에 따라 계산하기
    def calc(expr_list, prior):
        expr= expr_list[:] # 복사, 원본 변경 방지
        for op in prior: #('*','+','-') ..
            stack = []
            i = 0
            while i < len(expr):
                if expr[i] == op:
                    prev = stack.pop()
                    nxt = expr[i+1]
                    if op == '+':
                        stack.append(prev + nxt)
                    elif op == '-':
                        stack.append(prev - nxt)    
                    elif op == '*':
                        stack.append(prev * nxt)
                    i += 2 # 연산자, 피연산자 2개 스킵
                else: 
                    stack.append(expr[i])
                    i +=1
            expr = stack # 최신 데이터가 반영된 값으로 업데이트
        return abs(expr[0])
    
    # 5. 모든 우선순위 조합에 대해 계산하여 최댓값 찾기
    for op in li_oper :
        answer = max(answer, calc(parse_expr, op))
    return answer