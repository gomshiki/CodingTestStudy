package org.example.재귀;

import java.util.Scanner;

public class 피보나치수_배열사용 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] fibonacci = new int[N + 1]; // F(0)부터 시작하므로 'N+1'까지 생성

        for (int i = 0; i < fibonacci.length; i++) {

            /**
             * 첫번째와 두번째 수 '0'과 '1'로 정의
             * */
            if (i == 0) {
                fibonacci[0] = 0;
            } else if (i == 1) {
                fibonacci[1] = 1;
            } else {
                // 재귀함수 정의 (=점화식)
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }

        System.out.println("fibonacci = " + fibonacci[N]);
    }
}
