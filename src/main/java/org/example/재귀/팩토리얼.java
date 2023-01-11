package org.example.재귀;

import java.util.Scanner;

public class 팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;

        for (int i = 1; i < a+1 ; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
