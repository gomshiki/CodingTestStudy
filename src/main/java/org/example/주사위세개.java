package org.example;

import java.io.*;
import java.util.StringTokenizer;


public class 주사위세개 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = 0;

        int[] arr = {a, b, c};

        if (a == b && b== c) {

            System.out.println(10000 + (a*1000));

        } else if (a != b && b != c && c != a) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(100 * max);

        } else {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    if( arr[i] == arr[j]){
                        max = arr[i];
                    }
                }
            }

            System.out.println(1000 + (max*100));
        }
        br.close();

    }
}