package chapter01.example03;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("n의 값 :");

        int number = scanner.nextInt();
        int result = number * (1 + number) /2;
        System.out.println(result);

    }
}
