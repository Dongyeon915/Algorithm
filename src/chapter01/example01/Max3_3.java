package chapter01.example01;

import java.util.Scanner;

public class Max3_3 {

    private static final int NUM_OF_DATA = 4;

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        System.out.println("세 정수의 최대값을 구합니다.");

        Scanner scanner = new Scanner(System.in);
        System.out.println((int) 'a');

        for (int i = 0; i < NUM_OF_DATA; i++) {
            // println vs print vs printf
            System.out.printf("%c 의 값: ", 'a' + i);
            int input = scanner.nextInt();
            max = Integer.max(max, input);
        }

        System.out.println("최대값은 " + max + "입니다.");
    }

}
