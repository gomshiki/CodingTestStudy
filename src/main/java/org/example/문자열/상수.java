package org.example.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 상수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[st.countTokens()];

        for (int i = 0; i < arr.length; i++) {

            StringBuffer stringBuffer = new StringBuffer(st.nextToken());

            // String 뒤집기
            String s = stringBuffer.reverse().toString();
            arr[i] = Integer.parseInt(s);
        }

        System.out.println(Arrays.stream(arr).max().getAsInt());


    }
}
