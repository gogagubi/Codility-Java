package com.codility.lesson_10.prime_and_composite_numbers;

public class Excercise_10 {

    public static void main(String[] args) {
        if (true) {
            Excercise_10 s = new Excercise_10();
            int n = 100;

            System.out.println("Result " + s.divisors(n));
        }

    }


    public int divisors(int n) {
        int i = 1;
        int result = 0;

        while (i * i < n) {
            if (n % i == 0) {
                result += 2;
            }

            i++;
        }

        if (i * i == n) {
            result += 1;
        }

        return result;
    }


}
