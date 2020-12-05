package com.codility.lesson_09.maximum_slice;

public class Lesson_09_MaxDoubleSliceSum {

    public static void main(String[] args) {
        if (true) {
            Lesson_09_MaxDoubleSliceSum s = new Lesson_09_MaxDoubleSliceSum();
            int[] A = {3, 2, 6, -1, 4, 5, -1, 2};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_09_MaxDoubleSliceSum s = new Lesson_09_MaxDoubleSliceSum();
            int[] A = {0, 10, -5, -2, 0};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int N = A.length;
        int[] K1 = new int[N];
        int[] K2 = new int[N];

        for (int i = 1; i < N - 1; i++) {
            K1[i] = Math.max(K1[i - 1] + A[i], 0);
        }
        for (int i = N - 2; i > 0; i--) {
            K2[i] = Math.max(K2[i + 1] + A[i], 0);
        }

        int max = 0;

        for (int i = 1; i < N - 1; i++) {
            max = Math.max(max, K1[i - 1] + K2[i + 1]);
        }

        return max;
    }

}
