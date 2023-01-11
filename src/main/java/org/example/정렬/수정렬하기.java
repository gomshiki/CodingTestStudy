package org.example.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 수정렬하기 {

    public static void main(String[] args) throws IOException {

    /** 시간복잡도 : O(n)
     * 방법1) 선택정렬(Selection) + BufferedReader + StringBuilder
     **/

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    int[] arr = new int[N];

    /** 배열에 엽력값 닮기**/
    for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(br.readLine());
    }

    /** Selection sort **/
    for (int i = 0; i < N-1; i++) {
        for (int j = i+1; j < N; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

        for (int i : arr) {
            sb.append(i).append('\n'); // String을 append를 이용해 합치는 기능을 가짐
        }

        System.out.println(sb);
        br.close();

    }


}

