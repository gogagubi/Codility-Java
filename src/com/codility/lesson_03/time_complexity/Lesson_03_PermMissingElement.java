package com.codility.lesson_03.time_complexity;

public class Lesson_03_PermMissingElement {

    public static void main(String[] args) {
        if (true) {
            Lesson_03_PermMissingElement s = new Lesson_03_PermMissingElement();
            int[] A = {2, 3, 1, 5};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_03_PermMissingElement s = new Lesson_03_PermMissingElement();
            int[] A = {1};

            System.out.println("Result " + s.solution(A));
        }

        if(true){
            Lesson_03_PermMissingElement s = new Lesson_03_PermMissingElement();
            int[] A = {};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        boolean[] arr = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            arr[A[i] - 1] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) return i + 1;
        }

        return 0;
    }


}
