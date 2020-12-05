package com.codility.lesson_05.prefix_sums;

import java.util.*;

public class Lesson_05_GenomicRangeQueryV2 {

    public static void main(String[] args) {
        if (true) {
            Lesson_05_GenomicRangeQueryV2 s = new Lesson_05_GenomicRangeQueryV2();
            String S = "CAGCCTA";
            int[] P = {2, 5, 0};
            int[] Q = {4, 5, 6};

            System.out.println("Result " + Arrays.toString(s.solution(S, P, Q)));
        }

    }

    //Takes only 66%
    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        Map<Character, int[]> historyMap = getHistoryMap(N + 1);
        Map<Character, Integer> map = getMap();

        for (int i = 0; i < N; i++) {
            if (i > 0) {
                for (Map.Entry<Character, int[]> e : historyMap.entrySet()) {
                    e.getValue()[i + 1] = e.getValue()[i];
                }
            }
            char curr = S.charAt(i);
            historyMap.get(curr)[i + 1]++;
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            for (Map.Entry<Character, int[]> e : historyMap.entrySet()) {
                if (e.getValue()[Q[i] + 1] - e.getValue()[P[i]] > 0) {
                    result[i] = map.get(e.getKey());
                    break;
                }
            }
        }

        //System.out.println(historyMap)

        return result;
    }

    public Map<Character, int[]> getHistoryMap(int N) {
        Map<Character, int[]> map = new LinkedHashMap<>();
        map.put('A', new int[N]);
        map.put('C', new int[N]);
        map.put('G', new int[N]);
        map.put('T', new int[N]);

        return map;
    }

    public Map<Character, Integer> getMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('C', 2);
        map.put('G', 3);
        map.put('T', 4);
        return map;
    }


}
