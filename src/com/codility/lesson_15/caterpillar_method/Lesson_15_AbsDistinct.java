package com.codility.lesson_15.caterpillar_method;

public class Lesson_15_AbsDistinct {

    public static void main(String[] args) {
        if (true) {
            Lesson_15_AbsDistinct s = new Lesson_15_AbsDistinct();
            int[] A = {-5, -3, -1, 0, 3, 6};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_AbsDistinct s = new Lesson_15_AbsDistinct();
            int[] A = {-5};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_AbsDistinct s = new Lesson_15_AbsDistinct();
            int[] A = {};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_AbsDistinct s = new Lesson_15_AbsDistinct();
            int[] A = {1, 2, 3, 4};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_AbsDistinct s = new Lesson_15_AbsDistinct();
            int[] A = {-2147483648, -1, 0, 1};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Lesson_15_AbsDistinct s = new Lesson_15_AbsDistinct();
            int[] A = {-2147483648, -2147483648, 1, 1, 1};

            System.out.println("Result " + s.solution(A));
        }
    }

    public int solution(int[] A) {
        int N = A.length;

        int left = 0, right = N - 1;
        int ans = 0;

        while (left <= right) {
            while (left < right && A[left] == A[left + 1]) left++;
            while (left < right && A[right] == A[right - 1]) right--;

            if (A[left] == Integer.MIN_VALUE) {
                left++;
                ans++;
                continue;
            }

            int l = Math.abs(A[left]), r = Math.abs(A[right]);

            if (l > r) {
                left++;
                ans++;
            } else if (r > l) {
                right--;
                ans++;
            } else {
                ans++;
                left++;
                right--;
            }
        }

        return ans;
    }


}
