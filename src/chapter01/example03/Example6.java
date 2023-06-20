package chapter01.example03;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        System.out.print("a의 값 :");
        int numberA = scannerA.nextInt();
        System.out.print("b의 값 :");
        int numberB = scannerB.nextInt();

//        >/ a < b  => 다시 입력아!!!받받

        int result = (numberB - numberA + 1) * (numberA + numberB) / 2;
        System.out.println(result);
    }
//
//    public static int sumOf(int a,int b){
//        return a + b;
//    }
}
