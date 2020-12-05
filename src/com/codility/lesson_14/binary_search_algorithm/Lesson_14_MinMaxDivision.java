package com.codility.lesson_14.binary_search_algorithm;

public class Lesson_14_MinMaxDivision {

    public static void main(String[] args) {
        if (true) {
            Lesson_14_MinMaxDivision s = new Lesson_14_MinMaxDivision();
            int[] A = {2, 1, 5, 1, 2, 2, 2};
            int K = 3, M = 5;

            System.out.println("Result " + s.solution(K, M, A));
        }

    }

    public int solution(int K, int M, int[] A) {
        int lower = 0, upper = 0;
        for (int i : A) {
            lower = Math.max(lower, i);
            upper += i;
        }

        if (K == 1) return upper;
        if (K >= A.length) return lower;

        while (lower < upper) {
            int mid = lower + (upper - lower) / 2;
            if (isBlockValid(A, K, mid)) {
                upper = mid;
            } else {
                lower = mid + 1;
            }
        }

        return lower;
    }

    public boolean isBlockValid(int[] A, int maxCount, int maxSum) {
        int localCount = 0;
        int localSum = 0;

        for (int i = 0; i < A.length; i++) {
            localSum += A[i];

            if (localSum > maxSum) {
                localSum = A[i];
                localCount++;
            }

            if (localCount >= maxCount) {
                return false;
            }
        }

        return true;
    }


}
