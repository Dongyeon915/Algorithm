package chapter01.example02;

import java.util.Scanner;

public class Eaxmple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("이 수는 0입니다");
            return;
        } else {
            System.out.println(number >= 0 ? "이 수는 양수입니다" : "이 수는 음수입니다");
        }
    }

}
