package org.example.문자열;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class 단어공부 {

    public static void main(String[] args) {

        /**
        * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
        * */

        /**
         * 아스키코드
         * a = 97, z = 122, A = 65, Z = 90
         * */

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int[] arr = new int[26];


        // 입력받은 String 대문자로 일괄 변환
        String upperCase = S.toUpperCase();


        // 대문자로 변환한 String 값을 아스키코드를 기준으로 int 배열에 담아 해당 int 값일때 1 추가
        for (int i = 0; i < upperCase.length(); i++) {
            arr[upperCase.charAt(i)-65]++;
        }
        

        int count = 0;
        
        for (int i : arr) {
            if (i == Arrays.stream(arr).max().getAsInt()) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            for (int i=0; i < arr.length; i++) {
                if (arr[i] == Arrays.stream(arr).max().getAsInt()) {
                    System.out.println((char) (i + 65));
                    break;
                }
            }
        }


    }
}
