package com.codility.lesson_07.stack_and_queues;


import java.util.Stack;

public class Lesson_07_Fish {

    public static void main(String[] args) {
        if (true) {
            Lesson_07_Fish s = new Lesson_07_Fish();
            int[] A = {4, 3, 2, 1, 5};
            int[] B = {0, 1, 0, 0, 0};

            System.out.println("Result " + s.solution(A, B));
        }

        if (true) {
            Lesson_07_Fish s = new Lesson_07_Fish();
            int[] A = {3, 4, 1, 2, 5, 6};
            int[] B = {0, 1, 0, 0, 0, 1};

            System.out.println("Result " + s.solution(A, B));
        }

        if (true) {
            Lesson_07_Fish s = new Lesson_07_Fish();
            int[] A = {3, 4, 1, 2, 5, 6};
            int[] B = {0, 1, 0, 1, 0, 1};

            System.out.println("Result " + s.solution(A, B));
        }
    }

    public int solution(int[] A, int[] B) {
        int dead = 0;
        Stack<Integer> stack = new Stack<>();
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                while (!stack.isEmpty()) {
                    dead++;
                    if (stack.peek() > A[i]) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        return N - dead;
    }


}
