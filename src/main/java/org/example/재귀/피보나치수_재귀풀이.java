package org.example.재귀;

import java.util.Scanner;

public class 피보나치수_재귀풀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        System.out.println(fibonacci(N));
    }

    static int fibonacci(int n) {

        /**피보나치 수는 0과 1로 시작*/
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1 ) + fibonacci(n-2);
        // N 이 '2'이면 fibonacci(1) + fibonacci(0) 호출 ==> 1+0 = 1
        // N 이 '3'이면 fibonacci(2) + fibonacci(1) 호출 ==> 1 + 1 = 2
            // 다시 fibonacci(2)는 fibonacci(1) + fibonacci(0) 호출 ==> 1+0 = 1

    }

}
