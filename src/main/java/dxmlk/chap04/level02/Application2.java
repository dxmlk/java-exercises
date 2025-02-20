package dxmlk.chap04.level02;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height(m): ");
        double height = sc.nextDouble();
        System.out.println("Enter weight(kg): ");
        double weight = sc.nextDouble();

        double bmi = weight / (height*height);

        if (bmi<20) System.out.println("Underweight");
        else if (bmi<25) System.out.println("Healthy Weight");
        else if (bmi<30) System.out.println("Overweight");
        else System.out.println("Obese");

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

    }
}
