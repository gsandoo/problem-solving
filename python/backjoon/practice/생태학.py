# https://www.acmicpc.net/problem/4358
import sys
from collections import defaultdict, OrderedDict

input = sys.stdin.readline

dc = defaultdict(int)
cnt = 0

while True:
    line = input()
    if not line:  # EOF
        break
    s = line.strip()
    dc[s] += 1
    cnt += 1

o_d = OrderedDict(sorted(dc.items()))

for k, v in o_d.items():
    print(f"{k} {v/cnt*100:.4f}")

    
    
