package com.codility.lesson_07.stack_and_queues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Lesson_07_Brackets {

    public static void main(String[] args) {
        if (false) {
            Lesson_07_Brackets s = new Lesson_07_Brackets();
            String S = "{[()()]}";

            System.out.println("Result " + s.solution(S));
        }

        if (false) {
            Lesson_07_Brackets s = new Lesson_07_Brackets();
            String S = "([)()]";

            System.out.println("Result " + s.solution(S));
        }

        if (true) {
            Lesson_07_Brackets s = new Lesson_07_Brackets();
            String S = "((((((((((()))))))))))(()";

            System.out.println("Result " + s.solution(S));
        }

        if (true) {
            Lesson_07_Brackets s = new Lesson_07_Brackets();
            String S = "(((((((";

            System.out.println("Result " + s.solution(S));
        }

    }

    public int solution(String S) {
        int N = S.length();
        if(N == 0) return 1;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < N; i ++){
            char curr = S.charAt(i);

            if(map.get(curr) == null){
                stack.push(curr);
            }
            else{
                if(stack.isEmpty() || map.get(curr) != stack.pop()){
                    return 0;
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }


}
