package com.codility.lesson_04.counting_elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson_04_PermCheck {

    public static void main(String[] args) {
        if (true) {
            Lesson_04_PermCheck s = new Lesson_04_PermCheck();
            int[] A = {4, 1, 3, 2};

            System.out.println("Result " + s.solution(A));
        }


        if (true) {
            Lesson_04_PermCheck s = new Lesson_04_PermCheck();
            int[] A = {4, 1, 3};

            System.out.println("Result " + s.solution(A));
        }


    }

    //Using sorting
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 1; i <= A.length; i++) {
            if(A[i - 1] != i){
                return 0;
            }
        }

        return 1;
    }

    //Using HashSet
    public int solution1(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (int i = 1; i <= A.length; i++) {
            if (!set.contains(i)) {
                return 0;
            }
        }

        return 1;
    }



}
