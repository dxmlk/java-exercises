package dxmlk.chap03.level01;

public class Calculator {
    public void checkMethod() {
        System.out.println("checkMethod() Executed");
    }

    public int sum1to10() {
        int sum = 0;

        for (int i=1; i<=10; i++) {
            sum += i;
        }

        return sum;

    }

    public void checkMaxNumber(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    public int sumTwoNumber(int a, int b) {
        return (a+b);
    }

    public int minusTwoNumber(int a, int b) {
        return ((Math.max(a, b))-Math.min(a,b));
    }
}
