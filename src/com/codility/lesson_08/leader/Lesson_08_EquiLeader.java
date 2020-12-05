package com.codility.lesson_08.leader;

import java.util.HashMap;
import java.util.Map;

public class Lesson_08_EquiLeader {

    public static void main(String[] args) {
        if (true) {
            Lesson_08_EquiLeader s = new Lesson_08_EquiLeader();
            int[] A = {4, 3, 4, 4, 4, 2};

            System.out.println("Result " + s.solution(A));
        }

    }

    public int solution(int[] A) {
        int result = 0;
        int N = A.length;
        int half = N / 2;

        int leader = A[0];
        int meter = 0;

        for (int val : A) {
            if (leader == val) meter++;
            else meter--;

            if (meter == 0) {
                meter = 1;
                leader = val;
            }
        }

        //check possibility
        int occurrences = 0;
        for (int i : A) {
            if (i == leader) occurrences++;
        }
        if (occurrences <= half) return 0;

        int leadersInLeftPart = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) leadersInLeftPart++;

            int leadersInRightPart = (occurrences - leadersInLeftPart);
            if (leadersInLeftPart > (i + 1) / 2 && leadersInRightPart > (N - i - 1) / 2) {
                result++;
            }
        }

        return result;
    }


}
