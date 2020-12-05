package com.codility.lesson_04.counting_elements;

import java.util.Arrays;

public class Lesson_04_MaxCounters {

    public static void main(String[] args) {
        if (true) {
            Lesson_04_MaxCounters s = new Lesson_04_MaxCounters();
            int[] A = {3, 4, 4, 6, 1, 4, 4};
            int N = 5;

            System.out.println("Result " + Arrays.toString(s.solution(N, A)));
        }


    }

    public int[] solution(int N, int[] A){
        int top = 0;
        int max = 0;
        int[] counters = new int[N];

        for(int i = 0; i < A.length; i ++){
            if(A[i] == N + 1) top = max;
            else{
                counters[A[i] - 1] = Math.max(counters[A[i] - 1] + 1, top + 1);
                max = Math.max(max, counters[A[i] - 1]);
            }
        }

        for(int i = 0; i < counters.length; i ++){
            counters[i] = Math.max(counters[i], top);
        }

        return counters;
    }

    public int[] solution1(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int lastIncrease = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] - 1 < N) {
                if (lastIncrease > counters[A[i] - 1])
                    counters[A[i] - 1] = lastIncrease + 1;
                else
                    counters[A[i] - 1]++;

                max = Math.max(counters[A[i] - 1], max);
            } else {
                lastIncrease = max;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastIncrease) {
                counters[i] = lastIncrease;
            }
        }

        return counters;
    }


}
