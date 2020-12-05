package com.codility.lesson_06.sorting;

import java.util.Arrays;

public class Lesson_06_NumberOfDiscIntersectionsV2 {

    public static void main(String[] args) {
        if (true) {
            Lesson_06_NumberOfDiscIntersectionsV2 s = new Lesson_06_NumberOfDiscIntersectionsV2();
            int[] A = {1, 5, 2, 1, 4, 0};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        int N = A.length;
        long[] starts = new long[N];
        long[] ends = new long[N];

        for(int i = 0; i < N; i ++){
            starts[i] = i - (long)A[i];
            ends[i] = i + (long)A[i];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int openDisks = 0;
        int intersection = 0;

        int i = 0, j = 0;
        while(i < N && j < N){
            if(starts[i] <= ends[j]){
                intersection += openDisks;
                openDisks ++;
                i ++;
            }
            else{
                openDisks --;
                j ++;
            }

            if(intersection > 10000000){
                return -1;
            }
        }

        return intersection;
    }


}
