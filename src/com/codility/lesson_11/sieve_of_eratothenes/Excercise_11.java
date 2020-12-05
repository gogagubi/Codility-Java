package com.codility.lesson_11.sieve_of_eratothenes;

import java.util.*;

public class Excercise_11 {

    public static void main(String[] args) {
        if (true) {
            Excercise_11 s = new Excercise_11();
            int N = 26;

            System.out.println("Prime numbers: " + s.findPrimeNumbers(N));
        }

        if (true) {
            Excercise_11 s = new Excercise_11();
            int N = 26;

            System.out.println("Composite numbers: " + s.findCompositeNumbers(N));
        }

        if (true) {
            Excercise_11 s = new Excercise_11();
            int N = 26;

            System.out.println("Semi prime numbers: " + s.findSemiPrimeNumbers(N));
        }
    }

    //Find PRIME NUMBERS using SIEVE OF ERATOSTHENES
    public List<Integer> findPrimeNumbers(int N) {
        List<Integer> result = new ArrayList<>();
        boolean[] sieve = new boolean[N + 1];

        int i = 2;
        while (i * i <= N) {
            int k = i * i;
            while (k <= N) {
                sieve[k] = true;
                k += i;
            }

            i++;
        }

        for (i = 2; i <= N; i++) {
            if (!sieve[i]) {
                result.add(i);
            }
        }

        return result;
    }

    //find COMPOSITE NUMBERS using SIEVE OF ERATOSTHENES
    public List<Integer> findCompositeNumbers(int N) {
        List<Integer> result = new ArrayList<>();
        boolean[] sieve = new boolean[N + 1];

        int i = 2;
        while (i * i <= N) {
            int k = i * i;
            while (k <= N) {
                sieve[k] = true;
                k += i;
            }

            i++;
        }

        for (i = 2; i <= N; i++) {
            if (sieve[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public Set<Integer> findSemiPrimeNumbers(int N) {
        Set<Integer> semiPrimes = new HashSet<>();

        boolean[] sieve = new boolean[N + 1];
        for (int i = 0; i < sieve.length; i++) {
            if (i > 1) sieve[i] = true;
        }

        int i = 2;
        while (i * i <= N) {
            if (sieve[i]) {
                for (int j = i * i; j <= N; j += i) {
                    sieve[j] = false; //set false to all composite numbers
                }
            }
            i++;
        }

        i = 2;
        while (i * i <= N) {
            if (sieve[i]) { //is primary
                for (int j = i * i; j <= N; j += i) {
                    if (j % i == 0 && sieve[j / i]) {
                        semiPrimes.add(j);
                    }
                }
            }
            i++;
        }

        return semiPrimes;
    }
}
