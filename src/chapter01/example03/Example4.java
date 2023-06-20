package chapter01.example03;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("n의 값 :");
        int number = scanner.nextInt();

        int result = 0;
        int[] numberArray = new int[number];
        for (int i = 1; i <= number; i++) {
            numberArray[i - 1] = i;
            result += i;
        }

        // 3
        // 1 + 2 + 3 = 6
        for (int i = 0; i < numberArray.length; i++) {
            if (i == (number - 1)) {
                System.out.print(numberArray[i] + " = " + result);
            } else {
                System.out.print(numberArray[i] + " + ");
            }
        }
    }
}
