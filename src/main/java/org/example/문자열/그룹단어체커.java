package org.example.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean check = check(br.readLine());

            if (check==true) {
                count++;
            }
        }


        System.out.println(count);

    }
    public static boolean check(String str){

        boolean[] checklist = new boolean[26];

        // 이전 문자 저장용 변수
        int prev = 0;


        for (int j = 0; j < str.length(); j++) {

            // 문자열에서 한글자씩 뽑아서 now 변수에 저장
            char now = str.charAt(j);

            // 이전 뽑은 글자와 비교
            if (prev != now) {


                // 체크용 boolean 배열이 false이면 true 변경(history저장)
                if (checklist[now - 'a'] == false) {
                    checklist[now - 'a'] = true;
                    prev = now;
                } else {
                    // 이미 true 라면 해당 문자열은 그룹합수가 아님
                    return false;
                }

            // pp, aa, bb 와 같이 연속으로 출력되는 글자일 경우 pass
            } else {
                continue;
            }

        }

        return true;

    }

}
