package com.codility.lesson_02.arrays;

import java.util.Arrays;

public class Lesson_02_CyclicRotation {

    public static void main(String[] args) {
        if (false) {
            Lesson_02_CyclicRotation s = new Lesson_02_CyclicRotation();
            int[] A = {3, 8, 9, 7, 6};
            int K = 3;

            System.out.println("Result " + Arrays.toString(s.solution(A, K)));
        }

        if (true) {
            Lesson_02_CyclicRotation s = new Lesson_02_CyclicRotation();
            int[] A = {3, 8, 9, 7, 6};
            int K = 4;

            System.out.println("Result " + Arrays.toString(s.solution(A, K)));
        }

        if (false) {
            Lesson_02_CyclicRotation s = new Lesson_02_CyclicRotation();
            int[] A = {0, 0, 0};
            int K = 1;

            System.out.println("Result " + Arrays.toString(s.solution(A, K)));
        }

        if (false) {
            Lesson_02_CyclicRotation s = new Lesson_02_CyclicRotation();
            int[] A = {1, 2, 3, 4};
            int K = 4;

            System.out.println("Result " + Arrays.toString(s.solution(A, K)));
        }
    }

    public int[] solution(int[] A, int K) {
        int length = A.length;
        if (length == 0) return A;
        K = K % length;

        if (K > length / 2) {
            K = length - K;
            rightToLeft(A, K);
        } else {
            leftToRight(A, K);
        }

        return A;
    }

    private void leftToRight(int[] A, int K) {
        while (K > 0) {
            int last = A[A.length - 1];
            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }

            A[0] = last;
            K--;
        }
    }

    private void rightToLeft(int[] A, int K) {
        while (K > 0) {
            int first = A[0];
            for (int i = 0; i < A.length - 1; i++) {
                A[i] = A[i + 1];
            }

            A[A.length - 1] = first;
            K--;
        }
    }

}
