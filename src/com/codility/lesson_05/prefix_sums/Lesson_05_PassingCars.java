package com.codility.lesson_05.prefix_sums;


public class Lesson_05_PassingCars {

    public static void main(String[] args) {
        if (true) {
            Lesson_05_PassingCars s = new Lesson_05_PassingCars();
            int[] A = {0, 1, 0, 1, 1};

            System.out.println("Result " + s.solution(A));
        }

    }


    public int solution(int[] A) {
        int counter = 0, zeroCounter = 0;

        for(int i = 0; i < A.length; i ++){
            if(A[i] == 0) zeroCounter ++;
            if(A[i] == 1) counter += zeroCounter;

            if(counter > 1000000000) return -1;
        }
        return counter;
    }

}
