package chapter01.example03;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        System.out.print("a의 값 :");
        int numberA = scannerA.nextInt();
        System.out.print("b의 값 :");
        int numberB = scannerB.nextInt();

        // a < b  => 다시 입력받기
//        if (numberA < numberB) {
            while (numberA > numberB) {
                System.out.println("A값이 작습니다. 다시 입력");
                System.out.print("a의 값 :");
                numberA = scannerA.nextInt();
                System.out.print("b의 값 :");
                numberB = scannerB.nextInt();
            }
            int result = Math.abs(numberB - numberA + 1) * (numberA + numberB) / 2;
            System.out.println(result);
//        } else {
//            int result = Math.abs(numberB - numberA + 1) * (numberA + numberB) / 2;
//            System.out.println(result);
//        }
    }
}

