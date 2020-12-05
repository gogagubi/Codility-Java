package com.codility.lesson_06.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson_06_Distinct {

    public static void main(String[] args) {
        if (true) {
            Lesson_06_Distinct s = new Lesson_06_Distinct();
            int[] A = {2, 1, 1, 2, 3, 1};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int distinct = 0;
        for(int i = 0; i < A.length; i ++){
            if(i == 0 || A[i - 1] != A[i]) distinct ++;
        }

        return distinct;
    }

    //Uses memory
    public int solution2(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();
    }


}
