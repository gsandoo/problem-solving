# https://school.programmers.co.kr/learn/courses/30/lessons/42583
from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0
    bridge = deque([0] * bridge_length)   # 0,0
    truck_weights = deque(truck_weights)  # 7,4,5,6
    total_weight = 0

    while truck_weights or total_weight > 0:
        time += 1
        out_truck = bridge.popleft()
        total_weight -= out_truck

        if truck_weights:
            if total_weight + truck_weights[0] <= weight:
                in_truck = truck_weights.popleft()
                bridge.append(in_truck)
                total_weight += in_truck
            else:
                bridge.append(0)
    
    return time