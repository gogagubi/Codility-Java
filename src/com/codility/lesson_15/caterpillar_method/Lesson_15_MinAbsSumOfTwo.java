package com.codility.lesson_15.caterpillar_method;

import java.util.Arrays;

public class Lesson_15_MinAbsSumOfTwo {

    public static void main(String[] args) {
        if (true) {
            Lesson_15_MinAbsSumOfTwo s = new Lesson_15_MinAbsSumOfTwo();
            int[] A = {1, 4, -3};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_MinAbsSumOfTwo s = new Lesson_15_MinAbsSumOfTwo();
            int[] A = {-8, 4, 5, -10, 3};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int ans = 2000000000;

        int P = 0, Q = N - 1;
        while (P <= Q) {
            ans = Math.min(ans, Math.abs(A[P] + A[Q]));
            if (Math.abs(A[P]) > Math.abs(A[Q])) {
                P++;
            } else {
                Q--;
            }
        }

        return ans;
    }


}
