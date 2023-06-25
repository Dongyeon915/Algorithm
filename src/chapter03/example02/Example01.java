package chapter03.example02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example01 {

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

        int start = 0;
        int end = inputs.length;
        int mid = (start + end) / 2;
//      시작 값

        System.out.println("[Mid] Index : " + mid + ", Value: " + inputs[mid]);

        while (start <= end) {
            if (inputs[mid] == key) {
                // System.out.println("값이 같다");
                System.out.println("[Search] Index : " + mid + ", Value: " + inputs[mid]);
                return;
            } else {
                // System.out.println("값이 다르다");
                if (inputs[mid] < key) {
                    // System.out.println("[Right] key 값이 더 크다");
                    start = mid + 1;
                    mid = (start + end) / 2;
                } else {
                    // System.out.println("[Left] key 값이 더 작다");
                    end = mid - 1;
                    mid = (start + end) / 2;
                }
            }
        }
        System.out.println("찾으시려는 값이 존재하지 않습니다.");
    }
}
