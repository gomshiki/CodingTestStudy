package org.example.문자열;

import java.util.Scanner;

public class 아스키코드 {

    public static void main(String[] args) {

        /**
         * ASCII: American Standard Code for Information Interchange
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("아스키코드로 변경할 문자를 입력해주세요 >> ");

        /**
         * nextLint(), next() : String 타입으로 입력받음
         * charat(index): String 타입데이터를 character 타입으로 받아옴
         * */
        char target = sc.nextLine().charAt(0);
        int result = (int) target;
        System.out.println(result
        );
    }
}
