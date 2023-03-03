package org.example.이차원배열;

import java.io.IOException;
import java.util.*;


public class 색종이 {

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        Scanner sc = new Scanner(System.in);

        // 색종이 수량 입력
        int paperQty = sc.nextInt();


        // 각 색종이 좌표 입력할 List 인스턴스 생성
        List<int[]> papers = new ArrayList<>();


        // 좌표값을 papers List 추가
        for (int k = 0; k < paperQty; k++) {
            papers.add(new int[]{sc.nextInt(), sc.nextInt()});
        }


        // Boolean 2차원 배열을 이용해 색종이 좌표내 모든 값을 인덱스로 활용 -> value를 모두 False로
        boolean[][] checkArrays = new boolean[100][100];


        for (int i = 0; i < papers.size(); i++) {

            int a = papers.get(i)[0];
            int b = papers.get(i)[1];


            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    checkArrays[a][b] = true;
                    b++;
                }
                b -= 10;
                a++;
            }

        }
        // 제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한

        // Arrays 클래스 : static 메서드, 바로 사용가능
        // sort() = 정렬(default = 오름차순)
        // binarySearch() = 원하는 항목의 인덱스값을 가져올 수 있음. 없는 항목을 찾으면 음수값 리턴
        // Stream() : 스트림으로 변환
        int count = 0;

        for (int i = 0; i < checkArrays.length; i++) {
            for (int j = 0; j < checkArrays[i].length; j++) {
                if (checkArrays[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);



    }
}
