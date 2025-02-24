package dxmlk.chap05.level04;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] iarr = new int[6];

        for (int i=0; i<iarr.length; i++) {
            int rd = (int)(Math.random()*45)+1;
            iarr[i] = rd;
            for  (int j=0; j<i; j++) {
                if(iarr[j] == rd) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(iarr);

        for (int i : iarr) System.out.print(i+" ");

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */

    }
}
