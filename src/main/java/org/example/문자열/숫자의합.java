package org.example.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자의합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String B = br.readLine();

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < count; i++) {
            // ASCII : 문자 0 == 48번
            sum += B.charAt(i) - '0';
            sum2 += B.charAt(i) - 48;
        }

        System.out.println(sum);
        System.out.println(sum2);

        br.close();


    }
}
