package org.example;

public class 정수N개의합_함수 {

    public long sum(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}
