package chapter02.example;

import java.util.Arrays;
import java.util.Random;

public class
Example3 {

    public static void main(String[] args) {
        int[] array = new int[100];
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
            random.setSeed(array[i] % 1000);
            if (array[i] > maxValue){
                maxValue = array[i];
            } else if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(maxValue);
        System.out.println(minValue);
    }

}
