package org.example.BruteForce;

import java.util.Scanner;

public class 블랙잭 {

    /**
     * 완전탐색 알고리즘
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 숫자들의 수량
        int M = sc.nextInt(); // 목표 점수

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 갯수만큼의 배열에 입력값 대입
        }

        int result = search(arr,N, M);
        System.out.println("result = " + result);
    }

    /** 탐색 알고리즘 3중 for문 */
    static int search(int[] arr, int N, int M) {

        int result = 0;

        // 3개를 고르기 때문에 첫 번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < N - 2; i++) {

            // 첫 번째 카드가 M보다 크면 skip
            if (arr[i] > M) {
                continue; // continue 사용 시 즉시  다음 j++ 값일 경우로 이동함
            }

            // 두 번재 카드는 첫 번째 카드 다음부터 N-1까지만 순회
            for (int j = i+1; j < N - 1; j++) {

                // 두 번째 카드와 첫 번째 카드합이 M 보다 크다면 skip
                if (arr[i] + arr[j] > M) {
                    continue; // continue 사용 시 즉시  다음 j++ 값일 경우로 이동함
                }

                // 세 번째 카드는 두 번째 카드 다음부터 N 까지만 순회
                for (int k = j+1; k < N; k++) {

                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // M과 세 카드의 합이 같다면 temp return 및 종료
                    if (M == temp) {
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신
                    if (result < temp && temp < M) {
                        result = temp; //for문을 돌며 M에 가까운 값을 result에 초기화
                    }
                }
            }
        }

        // 모든 순회를 마치면 result 반환
        return result;
    }
}
