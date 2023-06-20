package chapter01.example01;

import java.util.Scanner;

public class Max3_4 {

    public static void main(String[] args) {
        int[] array = getInputArray(3);
        int max = getMaxValue(array);
        System.out.printf("%s은 %d입니다.\n", "최대값", max);

    }

    public static int[] getInputArray(int NUM_OF_DATA) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[NUM_OF_DATA];
        for (int i = 0; i < NUM_OF_DATA; i++) {
            System.out.printf("%c 의 값:",'a' + i );
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Integer.max(max, array[i]);
        }
        return max;
    }
}
