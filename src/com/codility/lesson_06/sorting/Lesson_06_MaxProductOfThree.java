package com.codility.lesson_06.sorting;

import java.util.Arrays;

public class Lesson_06_MaxProductOfThree {

    public static void main(String[] args) {
        if (true) {
            Lesson_06_MaxProductOfThree s = new Lesson_06_MaxProductOfThree();
            int[] A = {-3, 1, 2, -2, 5, 6};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int N = A.length;

        return Math.max(A[N - 1] * A[N - 2] * A[N - 3], A[0] * A[1] * A[N- 1]);
    }


}
