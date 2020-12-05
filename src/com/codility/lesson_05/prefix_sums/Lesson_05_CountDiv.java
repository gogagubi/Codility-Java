package com.codility.lesson_05.prefix_sums;

public class Lesson_05_CountDiv {

    public static void main(String[] args) {
        if (false) {
            Lesson_05_CountDiv s = new Lesson_05_CountDiv();
            int A = 6, B = 11, K = 2;

            System.out.println("Result " + s.solution(A, B, K));
        }

        if (false) {
            Lesson_05_CountDiv s = new Lesson_05_CountDiv();
            int A = 9, B = 27, K = 5;

            System.out.println("Result " + s.solution(A, B, K));
        }

        if (false) {
            Lesson_05_CountDiv s = new Lesson_05_CountDiv();
            int A = 10, B = 10, K = 5;

            System.out.println("Result " + s.solution(A, B, K));
        }

        if (true) {
            Lesson_05_CountDiv s = new Lesson_05_CountDiv();
            int A = 11, B = 347, K = 17;

            System.out.println("Result " + s.solution(A, B, K));
        }
    }

    public int solution(int A, int B, int K) {
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }

    public int solution1(int A, int B, int K) {
        return (int) Math.floor(B / (double) K) - (int) Math.ceil(A / (double) K) + 1;
    }

}
