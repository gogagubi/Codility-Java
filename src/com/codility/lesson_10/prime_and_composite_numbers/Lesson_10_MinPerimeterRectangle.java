package com.codility.lesson_10.prime_and_composite_numbers;

import java.util.ArrayList;
import java.util.List;

public class Lesson_10_MinPerimeterRectangle {

    public static void main(String[] args) {
        if (true) {
            Lesson_10_MinPerimeterRectangle s = new Lesson_10_MinPerimeterRectangle();
            int n = 30;

            System.out.println("Result " + s.solution(n));
        }

    }

    public int solution(int N) {
        int i = 1;
        int perimeter = Integer.MAX_VALUE;

        while(i * (long)i <= N){
            if(N % i == 0){
                int anotherSide = N / i;

                perimeter = Math.min(perimeter, (anotherSide + i) * 2);
            }
            i++;
        }

        return perimeter;
    }

}
