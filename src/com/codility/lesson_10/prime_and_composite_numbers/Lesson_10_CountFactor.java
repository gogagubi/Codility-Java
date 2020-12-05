package com.codility.lesson_10.prime_and_composite_numbers;

public class Lesson_10_CountFactor {

    public static void main(String[] args) {
        if (true) {
            Lesson_10_CountFactor s = new Lesson_10_CountFactor();
            int n = 24;

            System.out.println("Result " + s.solution(n));
        }

        if (false) {
            Lesson_10_CountFactor s = new Lesson_10_CountFactor();
            int n = 100;

            System.out.println("Result " + s.solution(n));
        }

        if (true) {
            Lesson_10_CountFactor s = new Lesson_10_CountFactor();
            int n = 2147483647;

            System.out.println("Result " + s.solution(n));
        }

    }


    public int solution(int N) {
        int divisors = 0;
        int i = 1;

        while (i * (long)i <= N) {
            if (N % i == 0) {
                divisors += (i * (long)i == N ? 1 : 2);
            }

            i++;
        }

        return divisors;
    }


}
