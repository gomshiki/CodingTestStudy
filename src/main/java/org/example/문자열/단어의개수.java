package org.example.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수 {

    public static void main(String[] args) throws IOException {

        /**
         * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
         * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
         */
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); // 한 라인 입력받기

        S = S.trim(); // 양쪽 공백제거

        String ans[] = S.split(" "); // 공백기준으로 스플릿

        if(ans.length == 1 && ans[0].equals("")) {
            System.out.println(0);
        }else {
            System.out.println(ans.length);
        }

    }

    // StringTokenizer 이용한 방법
    static void slicing() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());

    }

}
