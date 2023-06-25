package chapter02.example;

import java.util.Arrays;

public class Example4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int num = 0;
        // 절반인 2로 나눠 계산
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println("[Before]");
            System.out.println(Arrays.toString(array));
            swap(array, i);
            System.out.println("[After]");
            System.out.println(Arrays.toString(array));
        }
    }

    public static void swap(int[] arr, int idx01) {
        int num = arr[idx01];
        // 배열길이는 인덱스보다 1개가 더길기 때문에
        arr[idx01] = arr[arr.length - 1 - idx01];
        arr[arr.length - 1 - idx01] = num;
    }


    public static void swap(int[] arr, int start, int end) {
        int num = arr[start];
        // 배열길이는 인덱스보다 1개가 더길기 때문에
        arr[start] = arr[end];
        arr[end] = num;
    }

}
