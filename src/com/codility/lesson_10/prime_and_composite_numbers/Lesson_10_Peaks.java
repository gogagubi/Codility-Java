package com.codility.lesson_10.prime_and_composite_numbers;

import java.util.ArrayList;
import java.util.List;

public class Lesson_10_Peaks {

    public static void main(String[] args) {
        if (true) {
            Lesson_10_Peaks s = new Lesson_10_Peaks();
            int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

            System.out.println("Result " + s.solution(A));
        }

        if (false) {
            Lesson_10_Peaks s = new Lesson_10_Peaks();
            int[] A = {1, 4, 3, 2, 2, 2, 4, 3, 3, 2, 2, 1};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_10_Peaks s = new Lesson_10_Peaks();
            int[] A = {1, 1, 1, 1, 1, 1};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        List<Integer> peaksIndexes = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++)
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) peaksIndexes.add(i);

        int N = A.length;
        for (int size = peaksIndexes.size(); size > 0; size--) {
            if (N % size == 0) {
                boolean[] found = new boolean[size];
                int blockSize = N / size;
                int foundCount = 0;

                for (int peak : peaksIndexes) {
                    int blockNumber = peak / blockSize;

                    if (!found[blockNumber]) {
                        found[blockNumber] = true;
                        foundCount++;
                    }
                }

                if (foundCount == size) {
                    return size;
                }
            }
        }

        return 0;
    }


}
