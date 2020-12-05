package com.codility.lesson_06.sorting;

import java.util.Arrays;

public class Lesson_06_NumberOfDiscIntersections {

    public static void main(String[] args) {
        if (true) {
            Lesson_06_NumberOfDiscIntersections s = new Lesson_06_NumberOfDiscIntersections();
            int[] A = {1, 5, 2, 1, 4, 0};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        int N = A.length;
        long[] starts = new long[N];
        long[] ends = new long[N];
        int intersections = 0;
        int openDisks = 0;

        for (int i = 0; i < N; i++) {
            starts[i] = i - (long)A[i];
            ends[i] = i + (long)A[i];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int startIndex = 0, endIndex = 0;
        while (startIndex < N && endIndex < N) {
            if (starts[startIndex] <= ends[endIndex]) {
                intersections += openDisks;
                openDisks++;
                startIndex++;
            } else {
                openDisks--;
                endIndex++;
            }

            if (intersections > 10000000) {
                return -1;
            }
        }

        return intersections;
    }


}
