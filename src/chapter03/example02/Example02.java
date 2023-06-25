package chapter03.example02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int inputLength = 9900000;
        int[] inputs = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            inputs[i] = random.nextInt(900000);
        }

        Arrays.sort(inputs);
        System.out.println("[Input]");
        System.out.println(Arrays.toString(inputs));

        System.out.print("찾으시려는 값을 입력해주세요: ");
        int key = scanner.nextInt();

        int result = Arrays.binarySearch(inputs, key);
        System.out.println(result);
    }
}
