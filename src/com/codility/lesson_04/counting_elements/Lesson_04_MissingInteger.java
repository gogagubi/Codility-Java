package com.codility.lesson_04.counting_elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson_04_MissingInteger {

    public static void main(String[] args) {
        if (true) {
            Lesson_04_MissingInteger s = new Lesson_04_MissingInteger();
            int[] A = {1, 3, 6, 4, 1, 2};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_04_MissingInteger s = new Lesson_04_MissingInteger();
            int[] A = {1, 2, 3};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_04_MissingInteger s = new Lesson_04_MissingInteger();
            int[] A = {-1, -3};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        if(A[A.length - 1] < 1) return 1;

        int result = 1;

        for(int i = 0; i < A.length; i ++){
            if(result < A[i]) break;

            if(A[i] == result){
                result ++;
            }
        }

        return result;
    }

    public int solution1(int[] A) {
        int min = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < A.length; i ++){
            set.add(A[i]);
        }

        for(int i = 0; i < A.length; i ++){
            if(set.contains(min)){
                min ++;
            }
        }

        return min;
    }


}
