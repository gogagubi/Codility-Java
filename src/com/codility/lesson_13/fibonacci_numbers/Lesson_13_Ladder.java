package com.codility.lesson_13.fibonacci_numbers;

import java.util.Arrays;

public class Lesson_13_Ladder {

    public static void main(String[] args) {
        if (true) {
            Lesson_13_Ladder s = new Lesson_13_Ladder();
            int[] A = {4, 4, 5, 5, 1};
            int[] B = {3, 2, 4, 3, 1};

            System.out.println("Result " + Arrays.toString(s.solution(A, B)));
        }

    }

    public int[] solution(int[] A, int[] B) {
        int N = A.length;
        int maxEl = 0;

        for(int i = 0; i < A.length; i ++) maxEl = Math.max(maxEl, A[i]);

        int[] fibonacci = new int[maxEl + 1];
        fibonacci[0] = fibonacci[1] = 1;

        for(int i = 2; i < fibonacci.length; i ++){
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) & ((1 << 30) - 1);
        }

        int[] result = new int[N];
        for(int i = 0; i < N; i ++){
            result[i] = fibonacci[A[i]] & ((1 << B[i]) - 1);
        }

        return result;
    }

}
