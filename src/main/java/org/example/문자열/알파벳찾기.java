package org.example.문자열;


import java.io.IOException;
import java.util.Scanner;

public class 알파벳찾기 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
