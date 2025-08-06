# https://www.acmicpc.net/problem/10815

import sys 
input = sys.stdin.readline

n = int(input())
card = set(map(int, input().split()))
m = int(input())
a = list(map(int,input().split()))
answer = []

for n in a : 
    answer.append("1 ") if n in card else answer.append("0 ")

print(''.join(answer))