package com.codility.lesson_12.eucledian_algorithm;

public class Lesson_12_CommonPrimeDivisors {

    public static void main(String[] args) {
        if (true) {
            Lesson_12_CommonPrimeDivisors s = new Lesson_12_CommonPrimeDivisors();
            int[] A = {15, 10, 3};
            int[] B = {75, 30, 5};

            System.out.println("Result " + s.solution(A, B));
        }
    }

    public int solution(int[] A, int[] B) {
        int count = 0;
        for(int i = 0; i < A.length; i ++){
            if(hasCommonPrimeDivisor(A[i], B[i]) && hasCommonPrimeDivisor(B[i], A[i])) count ++;
        }

        return count;
    }

    public boolean hasCommonPrimeDivisor(int a, int b) {
        int greatestCommonDivisor;
        while (true) {
            greatestCommonDivisor = gcd(a, b);
            if (greatestCommonDivisor == 1) return a == 1;

            a /= greatestCommonDivisor;
        }
    }

    public int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }


}
