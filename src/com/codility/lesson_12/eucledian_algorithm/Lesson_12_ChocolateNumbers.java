package com.codility.lesson_12.eucledian_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson_12_ChocolateNumbers {

    public static void main(String[] args) {
        if (true) {
            Lesson_12_ChocolateNumbers s = new Lesson_12_ChocolateNumbers();
            int N = 17, M = 4;

            System.out.println("Result " + s.solution(N, M));
        }
    }

    public int solution(int N, int M) {
        return N / gdc(N, M);
    }

    public int gdc(int a, int b){
        if(a % b == 0) return b;
        return gdc(b, a % b);
    }

    //62% only
    public int solution1(int N, int M) {
        boolean[] eaten = new boolean[N];
        int index = 0;
        int result = 0;

        while (!eaten[index]) {
            eaten[index] = true;
            index = (index + M) % N;
            result++;
        }

        return result;
    }



}
