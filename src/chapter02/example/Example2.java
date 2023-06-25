package chapter02.example;

import java.util.Arrays;
import java.util.Random;

public class
Example2 {

    public static void main(String[] args) {
        //int random = (int) (Math.random() * 100) + 1;
        // 길이100의 배열에 랜덤값 넣기
        int[] array = new int[100];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
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
