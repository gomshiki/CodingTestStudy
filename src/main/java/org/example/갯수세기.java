package org.example;

import javax.naming.MalformedLinkException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 갯수세기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int target = Integer.parseInt(br.readLine());

        int[] arr = new int[total];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println(count);
        br.close();




    }
}
