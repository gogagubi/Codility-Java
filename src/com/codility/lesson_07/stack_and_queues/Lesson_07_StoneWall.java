package com.codility.lesson_07.stack_and_queues;

import java.util.Stack;

public class Lesson_07_StoneWall {

    public static void main(String[] args) {
        if (true) {
            Lesson_07_StoneWall s = new Lesson_07_StoneWall();
            int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};

            System.out.println("Result " + s.solution(H));
        }

    }

    public int solution(int[] H) {
        int blocks = 0;
        int N = H.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek() == H[i]) continue;

            blocks++;
            stack.push(H[i]);
        }

        return blocks;
    }


}
