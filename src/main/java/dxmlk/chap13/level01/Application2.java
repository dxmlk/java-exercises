package dxmlk.chap13.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Stack

public class Application2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> urls = new ArrayList<>();
        while(true) {
            System.out.print("방문 URL을 입력하세요 (단, exit을 입력하면 종료) : ");
            String url = br.readLine();

            if (url.equals("exit")) break;

            urls.add(url);

            int startIndex = 0;
            if (urls.size() > 5) {
                startIndex = urls.size() - 5;
            }

            System.out.print("최근 방문 url : [");
            for (int i = urls.size()-1; i >= startIndex; i--) {
                System.out.print(urls.get(i));
                if (i > startIndex) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");


        }
    }
}
