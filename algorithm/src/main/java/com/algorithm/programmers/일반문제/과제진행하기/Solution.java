package com.algorithm.programmers.일반문제.과제진행하기;

import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        LinkedList<Task> tasks = new LinkedList<>();
        for (String[] plan : plans) {
            tasks.offer(new Task(plan[0], convertToMinute(plan[1]), Integer.parseInt(plan[2])));
        }
        tasks.sort((t1, t2) -> t1.start - t2.start); // (1)

        Stack<Task> stopTasks = new Stack<>();
        List<String> endTasks = new ArrayList<>();
        Task now = tasks.poll();
        int time = now.start;
        while (!tasks.isEmpty()) {
            time += now.left;
            Task next = tasks.peek();

            if (time > next.start) { // (2)
                now.left = time - next.start;
                stopTasks.push(now);
            } else { // (3)
                endTasks.add(now.name);
                if (!stopTasks.empty()) { // (4)
                    now = stopTasks.pop();
                    continue;
                }
            }
            now = tasks.poll();
            time = now.start;
        }

        endTasks.add(now.name); // (5)
        while (!stopTasks.empty()) { // (6)
            endTasks.add(stopTasks.pop().name);
        }

        return endTasks.toArray(new String[0]);
    }

    private int convertToMinute(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    class Task {
        String name;
        int start;
        int left;

        Task(String name, int start, int left) {
            this.name = name;
            this.start = start;
            this.left = left;
        }
    }
}
