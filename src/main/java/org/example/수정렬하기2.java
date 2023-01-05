package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기2 {

    public static void main(String[] args) throws IOException {

        /**
         * 방법2) Arrays.sort + BufferedReader + StringBuilder
         **/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /** 입력받을 숫자 갯수 정의 **/
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        /** 입력데이터 행렬에 담기 **/
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /** 정렬 메소드 **/
        Arrays.sort(arr);

        for (int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);

    }
}
