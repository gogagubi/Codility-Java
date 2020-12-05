package com.codility.lesson_05.prefix_sums;

public class Lesson_05_MinAvgTwoSlice {

    public static void main(String[] args) {
        if (true) {
            Lesson_05_MinAvgTwoSlice s = new Lesson_05_MinAvgTwoSlice();
            int[] A = {4, 2, 2, 5, 1, 5, 8};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        int N = A.length;
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        double sum;
        double avg;

        for(int p = 0; p < N - 1; p ++){
            sum = A[p];
            for(int q = p + 1; q < p + 4 && q < N; q ++){
                sum += A[q];
                avg = sum / (q - p + 1);

                if(avg < min){
                    min = avg;
                    minIndex = p;
                }
            }
        }

        return minIndex;
    }

}
