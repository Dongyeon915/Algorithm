package chapter01.example03;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("n의 값 :");
        int number = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
