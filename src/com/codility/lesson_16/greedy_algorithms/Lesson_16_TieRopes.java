package com.codility.lesson_16.greedy_algorithms;

public class Lesson_16_TieRopes {

    public static void main(String[] args) {
        if (true) {
            Lesson_16_TieRopes s = new Lesson_16_TieRopes();
            int K = 4;
            int[] A = {1, 2, 3, 4, 1, 1, 3};

            System.out.println("Result " + s.solution(K, A));
        }

    }

    public int solution(int K, int[] A) {
        int ans = 0;
        int curr = 0;

        for (int i : A) {
            curr += i;
            if (curr >= K) {
                ans++;
                curr = 0;
            }
        }

        return ans;
    }


}
