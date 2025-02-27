package dxmlk.chap13.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> scores = new ArrayList<>();
        char cont = 'y';
        while(cont == 'y') {
            System.out.print("학생 성적 : ");
            scores.add(Integer.parseInt(br.readLine()));
            System.out.print("추가 입력하려면 y : ");
            cont = br.readLine().charAt(0);
        }

        int total = 0;
        for (int score : scores ) total += score;

        System.out.println("학생 인원 : "+scores.size());
        System.out.println("평균 점수 : "+total/scores.size());
    }
}
