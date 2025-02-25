package dxmlk.chap11.level01;

import java.io.*;
import java.util.Scanner;

public class Application1 {
    //### 파일 읽기 예외 처리
    //사용자로부터 파일 이름을 입력받아 해당 파일을 읽고
    // 내용을 출력하는 프로그램을 작성한다.
    // 파일이 존재하지 않을 경우에 대해 예외를 처리한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("파일 이름을 입력하세요 : ");
        String fName = sc.nextLine();

        FileReader fr = null;
        try {
            fr = new FileReader(fName);

            char[] carr = new char[(int) new File(fName).length()];

            fr.read(carr);

            for (char c : carr) {
                System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
