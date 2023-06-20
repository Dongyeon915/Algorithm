package chapter01.example03;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        boolean first = true;
        int numberA, numberB;
        Scanner scanner = new Scanner(System.in);

        do {
            if (!first) {
                System.out.println("[Error] a > b");
            }
            System.out.print("a의 값 :");
            numberA = scanner.nextInt();
            System.out.print("b의 값 :");
            numberB = scanner.nextInt();
            first = false;
        } while (numberA > numberB);

        int result = (numberB - numberA + 1) * (numberA + numberB) / 2;
        System.out.println(result);
    }
}

