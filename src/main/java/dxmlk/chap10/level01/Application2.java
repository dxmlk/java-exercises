package dxmlk.chap10.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Application2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String birth = br.readLine();

            LocalDate birthDate = LocalDate.parse(birth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            validateAge(birthDate);

            System.out.println("입장하셔도 됩니다.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidAgeException e) {
            e.getMessage();
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }


    }
    private static void validateAge (LocalDate  birthDate) throws InvalidAgeException {
        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate, today).getYears();

        if (age < 20) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }
    }
}

