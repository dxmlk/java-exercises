package dxmlk.chap03.level01;

public class Application {
    public static void main(String[] args) {
        Calculator cc = new Calculator();
        cc.checkMethod();
        System.out.println(cc.sum1to10());
        cc.checkMaxNumber(4, 5);
        System.out.println(cc.sumTwoNumber(1, 4));
        System.out.println(cc.minusTwoNumber(3, 8));

    }

}
