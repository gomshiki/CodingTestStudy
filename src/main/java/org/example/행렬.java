package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 행렬 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        /** 행렬 크기 정의(N x M) **/
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /** 2차원 배열 정의 **/
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];


        /** 첫번째 행렬 입력받기 **/
        for (int i = 0; i < N ; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /** 첫번째 행렬 입력받기 **/
        for (int i = 0; i < N ; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                System.out.print((A[i][j] + B[i][j]) + " ");

            }
            System.out.println();
        }

    }

}
