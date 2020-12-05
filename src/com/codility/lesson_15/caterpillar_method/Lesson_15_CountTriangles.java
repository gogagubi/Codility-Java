package com.codility.lesson_15.caterpillar_method;

import java.util.Arrays;

public class Lesson_15_CountTriangles {

    public static void main(String[] args) {
        if (true) {
            Lesson_15_CountTriangles s = new Lesson_15_CountTriangles();
            int[] A = {10, 2, 5, 1, 8, 12};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_CountTriangles s = new Lesson_15_CountTriangles();
            int[] A = {3, 3, 5, 6};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_CountTriangles s = new Lesson_15_CountTriangles();
            int[] A = {3, 3, 4, 5, 7};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int N = A.length;
        int ans = 0;
        Arrays.sort(A);

        for (int P = 0; P < N - 2; P++) {
            int Q = P + 1;
            int R = P + 2;

            while (R < N) {
                if (A[P] + A[Q] > A[R]) {
                    ans += R - Q;
                    R += 1;
                } else if (Q < R - 1) {
                    Q += 1;
                } else {
                    Q++;
                    R++;
                }
            }
        }

        return ans;
    }


}
