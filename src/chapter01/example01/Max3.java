package chapter01.example01;

import java.util.Scanner;

public class Max3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("세 정수의 최대값을 구합니다.");

        System.out.print("a의 값: ");
        int a = scanner.nextInt();

        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        System.out.print("c의 값: ");
        int c = scanner.nextInt();

        // 최대값
        if (a > b && a > c) {
            System.out.println("최대값은" + a + "입니다.");
        } else if (b > a && b > c) {
            System.out.println("최대값은" + b + "입니다.");
        } else {
            System.out.println("최대값은" + c + "입니다.");
        }

    }

}
