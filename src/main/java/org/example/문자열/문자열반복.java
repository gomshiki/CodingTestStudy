package org.example.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 문자열반복 {

    public static void main(String[] args) throws IOException {

        /** 반복할 숫자 및 문자열 입력받기 */
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        /** 테스트 케이스 수량 입력받기 */
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            /** 반복할 문자열 횟수 및 문자열 입력받기 */
            int M = sc.nextInt();
            String S = sc.next();
            /**  */
            for (int j = 0; j < S.length(); j++) {

                for (int k = 0; k < M; k++) {
                    sb.append(S.charAt(j));
                }

            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
