package chapter01.example02;

import java.util.Scanner;

public class MaxOfArray {

    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] ints = {1,2,3,4,5,6,7};

        for (int i = 0; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        System.out.printf("최대값은 %d", max);
    }

}
