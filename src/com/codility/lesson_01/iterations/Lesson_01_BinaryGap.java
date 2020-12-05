package com.codility.lesson_01.iterations;

public class Lesson_01_BinaryGap {

    public static void main(String[] args) {
        if (true) {
            Lesson_01_BinaryGap s = new Lesson_01_BinaryGap();
            int N = 9;

            System.out.println("Result " + s.solution(N));
        }

        if (true) {
            Lesson_01_BinaryGap s = new Lesson_01_BinaryGap();
            int N = 20;

            System.out.println("Result " + s.solution(N));
        }

        if (true) {
            Lesson_01_BinaryGap s = new Lesson_01_BinaryGap();
            int N = 32;

            System.out.println("Result " + s.solution(N));
        }

        if (true) {
            Lesson_01_BinaryGap s = new Lesson_01_BinaryGap();
            int N = 529;

            System.out.println("Result " + s.solution(N));
        }
    }

    public int solution(int N) {
        int maxGap = 0, currentGap = 0;
        String binary = toBinary(N);
        int prev = -1;
        boolean isOpen = false;

        for (int i = 0; i < binary.length(); i++) {
            char curr = binary.charAt(i);
            if (curr == '1' && curr != prev) isOpen = !isOpen;

            if (isOpen && curr == '0') {
                currentGap++;
            }

            if(!isOpen && currentGap > 0){
                maxGap = Math.max(currentGap, maxGap);
                currentGap = 0;
                isOpen = true;
            }

            prev = binary.charAt(i);
        }


        return maxGap;
    }

    public int solution1(int N){
        boolean isOpen = false;
        String binary = toBinary(N);
        int count = 0;
        int result = 0;

        char curr;
        for(int i = 0; i < binary.length(); i ++){
            curr = binary.charAt(i);
            if(curr == '1') {
                if(!isOpen) isOpen = true;
                else {
                    result = Math.max(count, result);
                    count = 0;
                }
            }

            if(curr == '0') count ++;
        }

        return result;
    }


    public String toBinary(int N) {
        StringBuilder result = new StringBuilder();
        while (N > 0) {
            int reminder = N % 2;
            N = N / 2;
            result.append(reminder);
        }
        return result.reverse().toString();
    }

}
