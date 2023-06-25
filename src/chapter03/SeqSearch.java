package chapter03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeqSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int num = scanner.nextInt();

        Random random = new Random();
        int numOfArray = 9900000;

        int[] array = new int[numOfArray];
        Arrays.sort(array);
        for (int i = 0; i < numOfArray; i++) {
            array[i] = random.nextInt(900000);
        }

        System.out.println(numOfArray + "개의 Data가 생성되었습니다.");
        System.out.println(String.format("%d개의 Data가 생성되었습니다.", numOfArray));
        System.out.println(Arrays.toString(array));

        boolean search = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println(array[i] + "은" + "[" + i + "]" + "에있습니다");
                search = true;
            }
        }

        if (!search) {
            System.out.println("Not Found Data!");
        }

    }

}
