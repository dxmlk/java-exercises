package dxmlk.chap05.level04;


import java.util.Random;
import java.util.Scanner;

public class Application2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();

            int[] targetNum = generateRandomNum(rd);

            int  count = 10;
            while (count > 0) {
                System.out.println(count + " chances left");

                String st;
                while (true) {
                    System.out.println("Enter 4-digit integer");
                    st = sc.nextLine();
                    if (st.length() == 4) break;
                    System.out.println("Enter 4-DIGIT INTEGER");
                }

                int[] userNum = new int[4];
                for (int i = 0; i < st.length(); i++) {
                    userNum[i] = st.charAt(i) - '0';
                }

                int sCount = 0;
                boolean[] isExisted = new boolean[10];
                for (int i=0; i<4; i++) {
                    if (targetNum[i] == userNum[i]) sCount++;
                    else isExisted[targetNum[i]] = true;
                }

                int bCount = 0;
                for (int i=0; i<4; i++) {
                    if (!(targetNum[i] == userNum[i]) && isExisted[userNum[i]] == true) bCount++;
                }

                if (sCount == 4) {
                    System.out.println("Correct");
                    return;
                }

                System.out.println(sCount+"S"+bCount+"B");
                count--;

            }

        }

        private static int[] generateRandomNum(Random rd) {
            int[] numbers = new int[4];
            int index = 0;
            boolean[] isUsed = new boolean[10];
            while (index < 4) {
                int random = rd.nextInt(10);
                if (!isUsed[random]) {
                    numbers[index++] = random;
                    isUsed[random] = true;
                }
            }
            return numbers;
        }
}
