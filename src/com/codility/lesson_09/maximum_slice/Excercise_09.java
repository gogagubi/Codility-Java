package com.codility.lesson_09.maximum_slice;

public class Excercise_09 {

    public static void main(String[] args) {
        if (true) {
            Excercise_09 s = new Excercise_09();
            int[] A = {5, -7, 3, 5, -2, 4, -1};

            System.out.println("Result " + s.solution(A));
        }

        if (true) {
            Excercise_09 s = new Excercise_09();
            int[] A = {5, -7, 3, 5, -2, 4, -1};

            System.out.println("Result " + s.solution1(A));
        }
    }

    //O(n) time
    public int solution(int[] A) {
        int maxEnding = 0, maxSlice = 0;

        for (int val : A) {
            maxEnding = Math.max(0, maxEnding + val);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        return maxSlice;
    }

    //O(n^2) time
    public int solution1(int[] A){
        int N = A.length;
        int sum = 0;
        int result = 0;

        for(int i = 0; i < N; i ++){
            sum = A[i];
            for(int j = i + 1; j < N; j ++){
                sum += A[j];
                result = Math.max(sum, result);
            }
        }

        return result;
    }

}
