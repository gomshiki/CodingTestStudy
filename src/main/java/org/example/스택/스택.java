package org.example.스택;

import java.util.Scanner;

public class 스택 {

    public static int[] stack;    /** int[] 배열을 가진 stack을 전역변수 정의 */

    public static int size = 0; /** index로 사용할 size 전역변수 정의 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt(); // 입력받을 명령어 수량

        stack = new int[N]; // 입력받은 수량만큼 stack 배열 인스턴스 생성

        for (int i = 0; i < N; i++) {
            String str = sc.next(); // 입력받은 명령어 str로 정의

            switch (str) { // 입력받은 명령어에 해당하는 'case' 실행 및 sb에 저장;
                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }

        }
        System.out.println(sb);

    }

    /** push 기능 : 입력받은 정수를 스택에 저장 */
    public static void push(int num) {
        stack[size] = num; // 초기 size = 0;
        size++; // size index 높이기 (배열[index] 역할)
    }

    /** pop 기능 : 스택 최상위 정수를 출력 및 삭제, 정수 없을경우 -1 출력 */
    public static int pop() {
        if (size == 0) { // 스택이 비여있을 경우 -1
            return -1;
        } else {
            int res = stack[size - 1];  // 최 상위 스택 정수값 출력을 위한 변수 지정
            stack[size -1] = 0;         // 출력된 정수값은 0으로 초기화
            size--;                     // 출력된 정수 위치 index 줄이기
            return res;                 // 출력된 정수 반환
        }
    }

    /** size : 스택에 정의된 정수의 개수 출력 */
    public static int size() {
        return size;    // 전역변수 'size'로 출력
    }

    /** empty : 스택이 비어있으면 1, 아니면 0 을 출력 */
    public static int empty() {
        if (size == 0) {    //
            return 1;
        } else {
            return 0;
        }
    }


    /** top : 최상위 정수를 출력, 스택이 비어있는 경우 -1 출력*/
    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1]; // 전역변수 size를 이용해 최상위 정수 반환
        }
    }
}
