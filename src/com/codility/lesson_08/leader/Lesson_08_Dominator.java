package com.codility.lesson_08.leader;

import java.util.HashMap;
import java.util.Map;

public class Lesson_08_Dominator {

    public static void main(String[] args) {
        if (true) {
            Lesson_08_Dominator s = new Lesson_08_Dominator();
            int[] A = {3, 4, 3, 2, 3, -1, 3, 3};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        int N = A.length;
        if (N == 0) return -1;
        int half = N / 2;

        int leader = A[0];
        int meter = 1;

        for (int val : A) {
            if (leader == val) meter++;
            else meter--;

            if (meter == 0) {
                meter = 1;
                leader = val;
            }
        }

        int occurrences = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == leader) {
                occurrences++;
            }

            if (occurrences > half) {
                return i;
            }
        }

        return -1;
    }

    //Using space solution
    public int solution1(int[] A) {
        int N = A.length;
        double half = N / (double) 2;
        int dominator = -1;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int value = map.getOrDefault(A[i], 0) + 1;
            if (value > half) {
                dominator = i;
                break;
            }

            map.put(A[i], value);
        }


        return dominator;
    }


}
