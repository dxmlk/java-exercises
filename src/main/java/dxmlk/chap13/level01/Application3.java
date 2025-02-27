package dxmlk.chap13.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> waiting = new LinkedList<>();
        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String guest = br.readLine();
            if (guest.equals("exit")) break;
            else if (guest.equals("next")) System.out.println(waiting.peek() == null ? "대기 고객이 없습니다." : waiting.poll()+" 고객님 차례입니다." );
            else {
                waiting.offer(guest);
                System.out.println(guest+" 고객님 대기 등록 되었습니다.");
            }
        }
    }
}
