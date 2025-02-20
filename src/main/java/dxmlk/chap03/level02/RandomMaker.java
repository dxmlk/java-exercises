package dxmlk.chap03.level02;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        int num = (int)(Math.random()*(max-min+1))+min;
        return num;
    }

    public String randomUpperAlpabet(int length) {
        String result = "";
        for (int i=0; i<length; i++) {
            int alpabet = (int)(Math.random()*26)+65;
            result += (char)alpabet;
        }
        return result;
    }

    public String rockPaperScissors() {
        int num = (int)(Math.random()*3);
        return switch (num) {
            case 0 -> ("Rock");
            case 1 -> ("Paper");
            default -> ("Scissors");
        };
    }

    public String tossCoin() {
        int num = (int)(Math.random()*2);
        if (num == 0) return ("Front");
        else return ("Back");
    }
}
