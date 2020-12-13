package com.codility.lesson_16.greedy_algorithms;

public class Lesson_16_MaxNonoverlappingSegments {

    public static void main(String[] args) {
        if (true) {
            Lesson_16_MaxNonoverlappingSegments s = new Lesson_16_MaxNonoverlappingSegments();
            int[] A = {1, 3, 7, 9, 9};
            int[] B = {5, 6, 8, 9, 10};

            System.out.println("Result " + s.solution(A, B));
        }

        if (true) {
            Lesson_16_MaxNonoverlappingSegments s = new Lesson_16_MaxNonoverlappingSegments();
            int[] A = {3, 7, 9, 1, 9};
            int[] B = {6, 8, 9, 10, 10};

            System.out.println("Result " + s.solution(A, B));
        }
    }

    public int solution(int[] A, int[] B) {
        int ans = 0;
        int N = A.length;
        if (N == 0) return ans;

        int end = B[0];
        ans = 1;
        for (int i = 1; i < N; i++) {
            if (A[i] > end) {
                ans++;
                end = B[i];
            }
        }

        return ans;
    }


}
