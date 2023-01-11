package org.example.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {

        /** 시간복잡도 : O(n)
         * 카운팅 정렬 + BufferedReader + StringBuilder
         * **/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        /**
         range : -1000 ~ 1000
         0은 index[1000]을 의미!
         */

        boolean[] arr = new boolean[2001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;;
            /** 예시 5, 2, 3, 4, 1일 경우
             * ...
             * arr[1005] = true
             * arr[1002] = true
             * arr[1003] = true
             * arr[1004] = true
             * arr[1001] = true
             * ...
             */
        }

        /**
         * 정렬 과정 불필요
         * */

        for (int i = 0; i < 2001; i++) {
            /**
             * 위에 true로 정의한 배열을 0~2000번까지 순서대로 출력하는데
             * true조건만 출력되도록함
             * */
            if (arr[i]) {
                sb.append(i - 1000).append('\n');
            }
        }

        System.out.println(sb);
        br.close();

    }
}
