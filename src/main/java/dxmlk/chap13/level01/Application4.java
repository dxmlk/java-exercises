package dxmlk.chap13.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

    public class Application4 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            LinkedList<String> ids = new LinkedList<>();
            while (true) {
                System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
                String id = br.readLine();
                if (id.equals("exit")) break;
                else {
                    if (ids.contains(id)) {
                        ids.remove(id);
                        System.out.println("이미 등록된 ID입니다.");
                    } else System.out.println("ID가 추가되었습니다.");
                    ids.addFirst(id);
                }
            }

            System.out.println("모든 학생의 ID: " + ids);
        }
    }
