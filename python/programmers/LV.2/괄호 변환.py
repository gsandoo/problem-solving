def solution(p):
    if not p:
        return ""

    def is_valid(s):
        stack = []
        for ch in s:
            if ch == '(':
                stack.append(ch)
            else:
                if not stack:
                    return False
                stack.pop()
        return True

    def divide(p):
        l = r = 0
        for i, ch in enumerate(p):
            if ch == '(':
                l += 1
            else:
                r += 1
            if l == r:
                return p[:i+1], p[i+1:]

    u, v = divide(p)
    if is_valid(u):
        return u + solution(v)
    else:
        # 4단계 규칙
        new_str = "("
        new_str += solution(v)
        new_str += ")"
        # u의 첫/끝 제거 후 괄호 반전
        u_trimmed = u[1:-1]
        reversed_u = ''.join('(' if ch == ')' else ')' for ch in u_trimmed)
        new_str += reversed_u
        return new_str
