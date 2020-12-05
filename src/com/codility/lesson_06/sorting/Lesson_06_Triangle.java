package com.codility.lesson_06.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson_06_Triangle {

    public static void main(String[] args) {
        if (true) {
            Lesson_06_Triangle s = new Lesson_06_Triangle();
            int[] A = {10, 2, 5, 1, 8, 20};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_06_Triangle s = new Lesson_06_Triangle();
            int[] A = {10, 50, 5, 1};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_06_Triangle s = new Lesson_06_Triangle();
            int[] A = {5, 2, 10, 1, 8, 20};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A){
        Arrays.sort(A);
        for(int i = 0; i < A.length - 2; i ++){
            if(A[i] + (long)A[i + 1] > A[i + 2]) return 1;
        }

        return 0;
    }

    public int solution1(int[] A) {
        int isTriangle = 0;
        Arrays.sort(A);

        for (int i = 2; i < A.length; i++) {
            long left = (long)A[i - 2] + (long)A[i - 1];
            if (left > A[i]) {
                isTriangle = 1;
                break;
            }
        }

        return isTriangle;
    }


}
