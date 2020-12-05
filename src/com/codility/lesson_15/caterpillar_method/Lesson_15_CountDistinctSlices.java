package com.codility.lesson_15.caterpillar_method;

import java.util.Arrays;

public class Lesson_15_CountDistinctSlices {

    public static void main(String[] args) {
        if (true) {
            Lesson_15_CountDistinctSlices s = new Lesson_15_CountDistinctSlices();
            int M = 6;
            int[] A = {3, 4, 5, 5, 2};

            System.out.println("Result " + s.solution(M, A));
        }

        if (true) {
            Lesson_15_CountDistinctSlices s = new Lesson_15_CountDistinctSlices();
            int M = 6;
            int[] A = {5, 3, 4, 5, 2, 1};

            System.out.println("Result " + s.solution(M, A));
        }

    }

    public int solution(int M, int[] A) {
        int N = A.length;
        int ans = 0;
        int limit = 1000000000;
        boolean[] seen = new boolean[M + 1];

        int P = 0, Q = 0;

        while (Q < N) {
            if(!seen[A[Q]]){
                ans += (Q - P + 1);

                if(ans >= limit) return limit;

                seen[A[Q]] = true;
                Q ++;
            }
            else{
                seen[A[P]] = false;
                P ++;
            }
        }

        return ans;
    }


}
