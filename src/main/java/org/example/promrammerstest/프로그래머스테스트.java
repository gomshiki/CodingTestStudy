package org.example.promrammerstest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 프로그래머스테스트 {

    static class Solution {
        public String solution(String s) {


            // count 형 배열
            int[] numbers = new int[10];

            StringBuilder sb = new StringBuilder();

            //
            String[] texts = new String[10];

            texts[1] = ".QZ";
            texts[2] = "ABC";
            texts[3] = "DEF";
            texts[4] = "GHI";
            texts[5] = "JKL";
            texts[6] = "MNO";
            texts[7] = "PRS";
            texts[8] = "TUV";
            texts[9] = "WXY";

            String[] digits = s.split("");

            for (int i = 0; i < s.length()-1; i++) {

                if (digits[i].equals(digits[i + 1]) || digits[i].equals("0")) {

                    numbers[Integer.parseInt(digits[i])]++;


                } else {

                    int count = numbers[Integer.parseInt(digits[i])];

                    char c = texts[Integer.parseInt(digits[i])].charAt(count);

                    sb.append(c);

                    // count 초기화
                    numbers[Integer.parseInt(digits[i])] = 0;

                }
            }

            int count = numbers[Integer.parseInt(digits[s.length()-1])];
            char c = texts[Integer.parseInt(digits[s.length() - 1])].charAt(count);
            sb.append(c);


            String answer = sb.toString();


            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("2220281");
    }

}

