package com.codility.lesson_02.arrays;

public class Lesson_02_OddOccurrencesInArray {

    public static void main(String[] args) {
        if (true) {
            Lesson_02_OddOccurrencesInArray s = new Lesson_02_OddOccurrencesInArray();
            int[] A = {9, 3, 9, 3, 9, 7, 9};

            System.out.println("Result " + s.solution(A));
        }


    }

    public int solution(int[] A) {
        int result = 0;

        for(int i = 0; i < A.length; i ++){
            result ^= A[i];
        }

        return result;
    }


}
