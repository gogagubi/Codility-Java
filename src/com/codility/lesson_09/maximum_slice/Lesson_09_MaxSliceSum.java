package com.codility.lesson_09.maximum_slice;

public class Lesson_09_MaxSliceSum {

    public static void main(String[] args) {
        if (true) {
            Lesson_09_MaxSliceSum s = new Lesson_09_MaxSliceSum();
            int[] A = {3, 2, -6, 4, 0};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_09_MaxSliceSum s = new Lesson_09_MaxSliceSum();
            int[] A = {-10};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int before = A[0];
        int sum = A[0];

        for (int i = 1; i < A.length; i++) {
            before = Math.max(A[i], before + A[i]);
            sum = Math.max(sum, before);
        }

        return sum;
    }

}
