package org.example;

public class SmallSubstring {

    public int solution(String t, String p) {

        // 갯수 비교할 count 변수
        int answer = 0;
        
        // 끝어낼 자릿수
        int length = p.length();

        // 기준이 될 num 정의
        long num = Long.parseLong(p);



        for (int i = 0; i < t.length() - length + 1; i++) {
            /**
             * substring(int 시작인덱스, int 종료인덱스)
             * */
            long diff = Long.parseLong(t.substring(i, i + length)); // string 't'를 'p'의 자릿수만큼 자르기

            if( diff <= num) answer++; // 자른 'diff' 값이 p의 값보다 작다면 count 변수 증가!
        }

        return answer;
    }

    public static void main(String[] args) {
        SmallSubstring smallSubstring = new SmallSubstring();
        System.out.println(smallSubstring.solution("3141592", "271"));  // 2
        System.out.println(smallSubstring.solution("500220839878", "7"));  // 8
        System.out.println(smallSubstring.solution("10203", "15"));  // 3
    }

}
