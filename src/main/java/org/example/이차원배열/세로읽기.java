package org.example.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 세로읽기 {

    public static void main(String[] args) throws IOException {

        // 문자열 입력받기위한 BufferedReader 인스턴스 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 이차원배열 선언
        char[][] arrys = new char[5][15];

        for (int i = 0; i < 5; i++) {

            // 한 줄을 읽어들여 문자열 s로 정의
            String s = br.readLine();

            //입력받은 문자열 길이까지 for문 돌도록
            for (int j = 0; j < s.length(); j++) {

                // 문자열을 charAt을 이용해 한 글자씩 배열에 담기
                arrys[i][j] = s.charAt(j);
            }

        }

        // 출력할 StringBuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 5; j++) {

                // char 이차원 배열이 '0'이 아니라면(배열에 값을 넣은 경우)
                if (arrys[j][i] != 0) {

                    // StringBuilder에 문자열 한개씩 저장
                    sb.append(arrys[j][i]);

                    // 이차원 배열이 '0'으로 비였을 경우 아무것도 하지 않고 Continue
                }else {
                    continue;
                }

            }
        }


        // 저장한 StringBuilder 출력!
        System.out.println(sb.toString());



    }
}
