package chapter02.example;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        boolean[] booleans = new boolean[100];
        char[] chars = new char[100];
        int[] ints = new int[100];
        int[][] arr01 =

            {
            {1, 3, 5, 7, 9},
            {1, 3, 5},
            {1}
        };

        int[] arr02 = {10, 50, 70};
        int[] arr02Copy = arr02.clone();
        int[] arr02FakeCopy = arr02;

        System.out.println(arr02.length);
        System.out.println(arr02Copy.length);
        System.out.println(arr02FakeCopy.length);

        System.out.println("Hash Code");
        System.out.println(arr02.hashCode());
        System.out.println(arr02Copy.hashCode());
        System.out.println(arr02FakeCopy.hashCode());

        boolean[] arr03 = Arrays.copyOf(booleans, 3);

//        System.out.println(arr04.length);
        System.out.println(Arrays.toString(arr03));

        arr02[1] = 1000;
        arr02FakeCopy[0] = 5000;
        System.out.println(Arrays.toString(arr02));
        System.out.println(Arrays.toString(arr02Copy));
        System.out.println(Arrays.toString(arr02FakeCopy));

    }
}
