package com.codility.lesson_05.prefix_sums;

import java.util.*;

public class Lesson_05_GenomicRangeQuery {

    public static void main(String[] args) {
        if (true) {
            Lesson_05_GenomicRangeQuery s = new Lesson_05_GenomicRangeQuery();
            String S = "CAGCCTA";
            int[] P = {2, 5, 0};
            int[] Q = {4, 5, 6};

            System.out.println("Result " + Arrays.toString(s.solution(S, P, Q)));
        }

    }


    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        char[] charValue = S.toCharArray();

        int[][] countsArr = new int[4][charValue.length + 1];

        for (int i = 0; i < charValue.length; i++) {
            if (i > 0) {
                for (int j = 0; j < 4; j++) {
                    countsArr[j][i + 1] = countsArr[j][i];
                }
            }

            switch (charValue[i]) {
                case 'A':
                    countsArr[0][i + 1]++;
                    break;
                case 'C':
                    countsArr[1][i + 1]++;
                    break;
                case 'G':
                    countsArr[2][i + 1]++;
                    break;
                case 'T':
                    countsArr[3][i + 1]++;
                    break;
            }
        }

        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (countsArr[j][Q[i] + 1] - countsArr[j][P[i]] > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }

        return result;
    }

    //I wrote it - only 75%
    public int[] solution1(String S, int[] P, int[] Q) {
        int N = P.length;
        int[] result = new int[N];

        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('A', 1);
        valueMap.put('C', 2);
        valueMap.put('G', 3);
        valueMap.put('T', 4);

        int charLength = S.length();
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        map.put('A', new ArrayList<>());
        map.put('C', new ArrayList<>());
        map.put('G', new ArrayList<>());
        map.put('T', new ArrayList<>());

        for (int i = 0; i < charLength; i++) {
            map.get(S.charAt(i)).add(i);
        }

        for (int i = 0; i < P.length; i++) {
            outer:
            for (Map.Entry<Character, List<Integer>> e : map.entrySet()) {
                for (Integer num : e.getValue()) {
                    if (num >= P[i] && num <= Q[i]) {
                        result[i] = valueMap.get(e.getKey());
                        break outer;
                    }
                }
            }
        }

        return result;
    }


}
