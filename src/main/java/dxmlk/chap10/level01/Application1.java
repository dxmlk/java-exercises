package dxmlk.chap10.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application1 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("분자 입력 :  ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.print("분모 입력 : ");
            int num2 = Integer.parseInt(br.readLine());

            // 나눗셈 수행
            int result = num1 / num2;
            System.out.println("결과: " + result);

        } catch (NumberFormatException e) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } catch (IOException e) {
            System.out.println("입력 오류가 발생했습니다.");
        } finally {
            System.out.println(" 실행이 완료되었습니다.");
        }
    }

}
