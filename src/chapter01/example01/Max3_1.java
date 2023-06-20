package chapter01.example01;

import java.util.Scanner;

public class Max3_1 {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        System.out.println("세 정수의 최대값을 구합니다.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        max = Integer.max(max, a);

        System.out.print("b의 값: ");
        int b = scanner.nextInt();
        max = Integer.max(max, b);

        System.out.print("c의 값: ");
        int c = scanner.nextInt();
        max = Integer.max(max, c);

        System.out.println("최대값은" + max + "입니다.");
    }

}
