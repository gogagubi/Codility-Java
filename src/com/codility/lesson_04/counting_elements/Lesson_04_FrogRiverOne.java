package com.codility.lesson_04.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class Lesson_04_FrogRiverOne {

    public static void main(String[] args) {
        if (true) {
            Lesson_04_FrogRiverOne s = new Lesson_04_FrogRiverOne();
            int X = 5;
            int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

            System.out.println("Result " + s.solution(X, A));
        }


        if (false) {
            Lesson_04_FrogRiverOne s = new Lesson_04_FrogRiverOne();
            int X = 5;
            int[] A = {1, 3, 1, 2, 2, 3, 5, 4};

            System.out.println("Result " + s.solution(X, A));
        }
    }

    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        int uniqueLeaves = 0;

        for(int i = 0; i < A.length; i ++){
            if(set.add(A[i])){
                uniqueLeaves ++;
            }

            if(uniqueLeaves == X){
                return i;
            }
        }

        return -1;
    }

    public int solution1(int X, int[] A) {
        int uniqueLeavesCount = 0;
        int[] leavesOnPositions = new int[X + 1];

        for (int i = 0; i < A.length; i++) {
            if (leavesOnPositions[A[i]] == 0) {
                leavesOnPositions[A[i]] = A[i];
                uniqueLeavesCount += 1;
            }

            if (uniqueLeavesCount == X) {
                return i;
            }
        }

        return -1;
    }


}
