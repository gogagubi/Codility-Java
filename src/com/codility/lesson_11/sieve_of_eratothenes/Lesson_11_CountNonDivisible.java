package com.codility.lesson_11.sieve_of_eratothenes;

import java.util.*;

public class Lesson_11_CountNonDivisible {

    public static void main(String[] args) {
        if (true) {
            Lesson_11_CountNonDivisible s = new Lesson_11_CountNonDivisible();
            int[] A = {3, 1, 2, 3, 6};

            System.out.println("Result " + Arrays.toString(s.solution(A)));
        }

        if (false) {
            Lesson_11_CountNonDivisible s = new Lesson_11_CountNonDivisible();
            int[] A = {3, 1, 2, 4, 3, 6};

            System.out.println("Result " + Arrays.toString(s.solution(A)));
        }

        if (false) {
            Lesson_11_CountNonDivisible s = new Lesson_11_CountNonDivisible();
            int[] A = {7, 3, 21, 30, 10};

            System.out.println("Result " + Arrays.toString(s.solution(A)));
        }
    }

    public int[] solution(int[] A) {
        int N = A.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int val : A) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            int divisorsCount = 0;

            for (int j = 1; j * j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    divisorsCount += map.getOrDefault(j, 0);
                    if (j * j != A[i]) divisorsCount += map.getOrDefault(A[i] / j, 0);
                }
            }

            result[i] = A.length - divisorsCount;
        }

        return result;
    }

    //This solution works on python but slow on java
    public int[] solution1(int[] A){
        int N = A.length;
        Map<Integer, Set<Integer>> divisors = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();
        int maxElement = 0;

        for(int i: A){
            Set<Integer> set = new HashSet<>();
            set.add(i);
            set.add(1);
            divisors.put(i, set);

            maxElement = Math.max(maxElement, i);

            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }

        for(int i = 2; i * i <= maxElement; i ++){
            for(int j = i; j <= maxElement; j += i){
                if(divisors.containsKey(j)){
                    Set<Integer> s = divisors.get(j);
                    s.add(i);
                    s.add(j / i);
                }
            }
        }

        int[] result = new int[N];
        for(int i = 0; i < N; i ++){
            int sum = 0;
            for(int c: divisors.get(A[i])){
                sum += counts.getOrDefault(c, 0);
            }

            result[i] = N - sum;
        }

        return result;
    }
}
