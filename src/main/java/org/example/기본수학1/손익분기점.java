package org.example.기본수학1;

import java.io.IOException;
import java.util.Scanner;

public class 손익분기점 {


    public static void main(String[] args) throws IOException {

        // 고정비용 A
        // 가변비용 B
        // 노트북 1대 생산비용 A=1000, B= 70, 총비용 1070
        // 노트북 10대 생산비용 A=1000, B= 700, 총 비용 1700

        // 노트북 가격이 C만원으로 책정, 총비용(A+B) < 총수입(C*N) 지점을 손익분기점(Break-even point)라고함

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int N = (A / (C - B)) + 1;

        if (C <= B) {
            System.out.println(-1);
        } else {
            System.out.println(N);
        }


    }
}
