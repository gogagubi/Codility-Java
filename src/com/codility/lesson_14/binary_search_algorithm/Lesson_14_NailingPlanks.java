package com.codility.lesson_14.binary_search_algorithm;

public class Lesson_14_NailingPlanks {

    public static void main(String[] args) {
        if (true) {
            Lesson_14_NailingPlanks s = new Lesson_14_NailingPlanks();
            int[] A = {1, 4, 5, 8};
            int[] B = {4, 5, 9, 10};
            int[] C = {4, 6, 7, 10, 2};

            System.out.println("Result " + s.solution(A, B, C));
        }

        if (true) {
            Lesson_14_NailingPlanks s = new Lesson_14_NailingPlanks();
            int[] A = {1, 6};
            int[] B = {5, 7};
            int[] C = {3, 2, 4, 6};

            System.out.println("Result " + s.solution(A, B, C));
        }
    }


    private int solution(int[] A, int[] B, int[] C) {
        int ans = -1;
        int N = A.length;
        int M = C.length;

        int beg = 0, end = M;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            int[] prefSum = new int[2 * M + 1];

            for (int i = 0; i < mid; i++) {
                prefSum[C[i]] += 1;
            }

            for (int i = 1; i < prefSum.length; i++) {
                prefSum[i] += prefSum[i - 1];
            }

            boolean failed = false;
            for (int i = 0; i < N; i++) {
                if (prefSum[B[i]] == prefSum[A[i] - 1]) {
                    failed = true;
                    break;
                }
            }

            if (failed) {
                beg = mid + 1;
            } else {
                end = mid - 1;
                ans = mid;
            }
        }

        return ans;
    }


}
