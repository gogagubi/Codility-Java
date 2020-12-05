package com.codility.lesson_10.prime_and_composite_numbers;

import java.util.ArrayList;
import java.util.List;

public class Lesson_10_Flags {

    public static void main(String[] args) {
        if (true) {
            Lesson_10_Flags s = new Lesson_10_Flags();
            int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_10_Flags s = new Lesson_10_Flags();
            int[] A = {1, 3, 2};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_10_Flags s = new Lesson_10_Flags();
            int[] A = {1, 2, 1, 2, 1, 3, 2, 5, 4, 6, 7, 3, 2, 3, 4, 3, 7, 2};

            System.out.println("Result " + s.solution(A));
        }
    }


    public int solution(int[] A) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) peaks.add(i);
        }

        int maxFlags = Math.min(peaks.size(), (int) Math.ceil(Math.sqrt(A.length)));
        if (maxFlags <= 2) return maxFlags;

        for (int i = maxFlags; i > 0; i--) {
            int need = i;

            int l = 0, r = peaks.size() - 1;
            int leftFlag = peaks.get(l) - i, rightFlag = peaks.get(r) + i;
            while (l <= r) {
                if (peaks.get(l) - leftFlag >= i && rightFlag - peaks.get(l) >= i) {
                    leftFlag = peaks.get(l);
                    need--;
                }

                if (peaks.get(r) - leftFlag >= i && rightFlag - peaks.get(r) >= i) {
                    rightFlag = peaks.get(r);
                    need--;
                }

                if (need == 0) return i;
                if (need * i + 1 > rightFlag - leftFlag) break;

                l++;
                r--;
            }
        }

        return 0;
    }


}
