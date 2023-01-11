package org.example.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀의귀재 {

    static int count = 0; // 함수 호출용 count 변수 정의

    /**
     * s : 입력받은 문자열
     * l : 문자열 첫번째 글자부터 순서대로 증가
     * r : 문자열 마지막째 글자부터 순서대로 감소
     * */
    public static int recursion(String s, int l, int r){

        count++; // 함수 호출 시 +1씩 증가

        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0; // chartAt(n) : n번째 자리 문자를 'char'로 변환
        else return recursion(s, l+1, r-1);

    }
    public static int isPalindrome(String s){

        return recursion(s, 0, s.length()-1);

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int totalCount = Integer.parseInt(br.readLine());

        String[] inputData = new String[totalCount];

        for (int i = 0; i < totalCount; i++) {
            inputData[i]= br.readLine();
        }

        for (int i = 0; i < totalCount; i++) {
            sb.append(isPalindrome(inputData[i])).append(" "+count).append('\n');
            count=0; // 호출 종료 후 count=0 으로 초기화
        }

        System.out.println(sb);
        br.close();

        //System.out.println("ABBA: " + isPalindrome("ABBA"));
        //System.out.println("ABC: " + isPalindrome("ABC"));
    }
}
