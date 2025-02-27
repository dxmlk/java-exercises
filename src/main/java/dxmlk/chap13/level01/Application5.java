package dxmlk.chap13.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> dictionary = new TreeSet<>();
        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = br.readLine();
            if (word.equals("exit")) break;
            dictionary.add(word);
        }
        System.out.println("정렬된 단어 : "+dictionary);
    }
}