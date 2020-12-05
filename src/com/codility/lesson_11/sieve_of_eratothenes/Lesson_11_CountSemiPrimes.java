package com.codility.lesson_11.sieve_of_eratothenes;

import java.util.*;

public class Lesson_11_CountSemiPrimes {

    public static void main(String[] args) {
        if (true) {
            Lesson_11_CountSemiPrimes s = new Lesson_11_CountSemiPrimes();
            int N = 26;
            int[] P = {1, 4, 16};
            int[] Q = {26, 10, 20};

            System.out.println("Prime numbers: " + Arrays.toString(s.solution(N, P, Q)));
        }
    }

    public int[] solution(int N, int[] P, int[] Q) {
        Set<Integer> semiPrimeNumbers = getSemiprimes(N);

        int[] dp = new int[N + 1];
        for (int j = 1; j <= N; j++) {
            dp[j] = dp[j - 1];
            if (semiPrimeNumbers.contains(j)) {
                dp[j] += 1;
            }
        }

        int[] result = new int[P.length];
        for (int j = 0; j < P.length; j++) {
            result[j] = dp[Q[j]] - dp[P[j] - 1];
        }

        return result;
    }

    public Set<Integer> getSemiprimes(int N) {
        Set<Integer> result = new HashSet<>();

        boolean[] sieve = new boolean[N + 1];

        int i = 2;
        while (i * (long) i <= N) {
            for (int j = i * i; j <= N; j += i) {
                sieve[j] = true;
            }
            i++;
        }

        i = 2;
        while (i * (long) i <= N) {
            if (!sieve[i]) {
                for (int j = i * i; j <= N; j += i) {
                    if (!sieve[j / i]) {
                        result.add(j);
                    }
                }
            }
            i++;
        }

        return result;
    }
}
