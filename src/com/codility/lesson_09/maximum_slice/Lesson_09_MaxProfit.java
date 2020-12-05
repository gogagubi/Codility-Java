package com.codility.lesson_09.maximum_slice;

public class Lesson_09_MaxProfit {

    public static void main(String[] args) {
        if (true) {
            Lesson_09_MaxProfit s = new Lesson_09_MaxProfit();
            int[] A = {23171, 21011, 21123, 21366, 21013, 21367};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_09_MaxProfit s = new Lesson_09_MaxProfit();
            int[] A = {4, 3, 6, 2};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution1(int[] A) {
        int N = A.length;
        if (N == 0) return N;

        int buy = A[0];
        int profit = 0;

        for (int i = 1; i < N; i++) {
            if (A[i] < buy) {
                buy = A[i];
            } else {
                profit = Math.max(A[i] - buy, profit);
            }
        }

        return profit;
    }

    public int solution(int[] A) {
        int maxProfit = 0;
        int minPrice = 200000;

        for (int i = 1; i < A.length; i++) {
            minPrice = Math.min(minPrice, A[i]);
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
        }

        return maxProfit;
    }

}
