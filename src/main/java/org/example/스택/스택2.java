package org.example.스택;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스택2 {

    public static int[] stack;
    public static int size;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        stack = new int[num];

        while(num-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
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
        br.close();

    }

    public static void push(int a) {
        stack[size] = a;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }else {
            int result = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return result;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int top() {
        if (size == 0) {
            return -1;
        } else {
            int result = stack[size - 1];
            return result;
        }
    }
}
