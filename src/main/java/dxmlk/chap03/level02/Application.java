package dxmlk.chap03.level02;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();

        System.out.println(rm.randomNumber(30, 60));
        System.out.println(rm.randomUpperAlpabet(5));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());

    }

}
