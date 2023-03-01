package org.example.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최대값 {

    public static void main(String[] args) throws IOException {


        // BufferReader : 데이터 이동에  효율을 높여줌 (10m 거리에 있는 짐을 사람 혼자 여러번 옮기기 vs 자동차로 1번에 옮기기)
        // InputStreamReader : 데이터를 byte 단위로 입력받는 통로 역할
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[][] arrys = new int[9][9];

        // br.readLine(); 한줄 씩 가져옴

        int max  = 0;
        int a = 0;
        int b = 0;


        for (int i = 0; i < 9; i++) {

            // BufferedReader 첫쩃줄 -> StringTokenizer로 정의
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 9; j++) {


                // 토크나이저 값을 Int 형변환 후 배열에 입력
                arrys[i][j] = Integer.parseInt(st.nextToken());

                // 조건 : max < 배열 값이 클 경우, max 값 교체
                if (max < arrys[i][j]) {
                    max = arrys[i][j];
                    a = i;
                    b = j;

                }

            }
        }

        System.out.println(max);
        // 배열은 0번부터 시작 -> +1 해줘야함
        System.out.println((a + 1) + " " + (b + 1));

        br.close();


    }

}
