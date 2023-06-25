package chapter02.example;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        //int random = (int) (Math.random() * 100) + 1;
        // 길이100의 배열에 랜덤값 넣기
        int[] array = new int[101];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) +1;
            if (array[i] > maxValue){
                maxValue = array[i];
            } else if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());
        System.out.println(maxValue);
        System.out.println(minValue);
    }

}
