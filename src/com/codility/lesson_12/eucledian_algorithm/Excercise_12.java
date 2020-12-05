package com.codility.lesson_12.eucledian_algorithm;

public class Excercise_12 {

    public static void main(String[] args) {
        if (true) {
            Excercise_12 s = new Excercise_12();
            int a = 10, b = 4;

            System.out.println("Greatest common divisor: " + s.gdc(a, b));
        }

        if (true) {
            Excercise_12 s = new Excercise_12();
            int a = 10, b = 4;

            System.out.println("Greatest common divisor: " + s.gdcByDividing(a, b));
        }

        if (true) {
            Excercise_12 s = new Excercise_12();
            int a = 10, b = 4;

            System.out.println("Greatest common divisor: " + s.gcdByDivision(a, b));
        }
    }


    public int gdc(int a, int b) {
        if (a == b) {
            return a;
        }

        if (a > b) {
            return gdc(a - b, b);
        } else {
            return gdc(a, b - a);
        }
    }

    public int gdcByDividing(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gdcByDividing(b, a % b);
        }
    }

    public int gcdByDivision(int A, int B) {
        if (A % B == 0) return B;
        else return gcdByDivision(B, A % B);
    }
}
