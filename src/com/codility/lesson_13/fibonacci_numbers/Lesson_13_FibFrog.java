package com.codility.lesson_13.fibonacci_numbers;

import java.util.HashSet;
import java.util.Set;

public class Lesson_13_FibFrog {

    public static void main(String[] args) {
        if (false) {
            Lesson_13_FibFrog s = new Lesson_13_FibFrog();
            int[] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_13_FibFrog s = new Lesson_13_FibFrog();
            int[] A = {};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int N = A.length;

        Set<Integer> fibonacci = getFibonacci(N);

        int index = 0;
        int count = 0;
        int lastPosition = 0;
        while (index <= N) {
            int candidateFibonacci = index - lastPosition + 1;

            if (index < N - 1 && A[index] == 1 && A[index + 1] == 1 && fibonacci.contains(candidateFibonacci + 1)) {
                index++;
            }

            candidateFibonacci = index - lastPosition + 1;

            if (index == N || (A[index] == 1 && fibonacci.contains(candidateFibonacci))) {
                count++;
                lastPosition = index + 1;
            }

            index++;
        }

        return count;
    }


    private Set<Integer> getFibonacci(int N) {
        Set<Integer> fibonacci = new HashSet<>();
        int beforePrev = 0, prev = 1, curr;
        fibonacci.add(beforePrev);
        while (beforePrev + prev <= N) {
            curr = beforePrev + prev;
            fibonacci.add(curr);
            beforePrev = prev;
            prev = curr;
        }

        return fibonacci;
    }

}
