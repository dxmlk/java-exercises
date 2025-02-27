package dxmlk.chap13.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Application6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> phonebook = new HashMap<>();

        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = br.readLine();
            if (input.equals("exit")) break;
            else if (input.equals("search")) {
                System.out.print("검색할 이름: ");
                String searchName = br.readLine();
                if (phonebook.containsKey(searchName)) System.out.println(searchName+"씨의 전화번호 : "+phonebook.get(searchName));
                else System.out.println(searchName+"씨의 번호는 등록되어 있지 않습니다.");
            } else {
                String[] parts = input.split(" ");
                if (parts.length == 2) {
                    phonebook.put(parts[0], parts[1]);
                    System.out.println("추가 완료 : "+input);
                } else System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            }
        }
    }
}
