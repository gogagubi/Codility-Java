package com.codility.lesson_03.time_complexity;

public class Lesson_03_FrogJmp {

    public static void main(String[] args) {
        if (true) {
            Lesson_03_FrogJmp s = new Lesson_03_FrogJmp();
            int X = 10;
            int Y = 85;
            int D = 30;

            System.out.println("Result " + s.solution(X, Y, D));
        }


    }

    public int solution(int X, int Y, int D) {
        int distance = Y - X;

        if(distance % D == 0){
            return distance / D;
        }

        return distance / D + 1;
    }


}
