package dxmlk.conditional.section01.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        if (num>10 || num < 0) {
            System.out.println("You should enter a number between 1 and 10.");
        }
        else {
            if (num%2==0) System.out.println(num+" is EVEN.");
            else System.out.println(num+" is ODD.");
        }

    }
}
