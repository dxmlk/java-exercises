package dxmlk.chap04.level02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer: ");
        int N = sc.nextInt();

        if (N>=1 && N<=10) System.out.println((N%2==0) ? "Even" : "Odd");
        else System.out.println("Enter a integer between 1 and 10");


        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

    }

}
