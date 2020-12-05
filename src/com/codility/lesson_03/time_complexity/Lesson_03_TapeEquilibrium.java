package com.codility.lesson_03.time_complexity;

public class Lesson_03_TapeEquilibrium {

    public static void main(String[] args) {
        if (true) {
            Lesson_03_TapeEquilibrium s = new Lesson_03_TapeEquilibrium();
            int[] A = {3, 1, 2, 4, 3};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;

        int left = A[0], right = 0;
        for(int i = 1; i < A.length; i ++) right += A[i];
        min = Math.min(min, Math.abs(left- right));

        for(int i = 2; i < A.length; i ++){
            left += A[i - 1];
            right -= A[i - 1];

            min = Math.min(min, Math.abs(left - right));
        }

        return min;
    }

    public int solution1(int[] A) {
        int P = 1;
        int left = A[P - 1];
        int right = 0;

        for (int i = P; i < A.length; i++) {
            right += A[i];
        }

        int result = Math.abs(left - right);


        for(int i = P + 1; i < A.length; i ++){
            left += A[i - 1];
            right -= A[i - 1];

            int current = Math.abs(left - right);
            result = Math.min(current, result);
        }

        return result;
    }


}
