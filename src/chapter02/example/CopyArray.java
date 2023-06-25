package chapter02.example;

import java.util.Arrays;

public class CopyArray {

//  호출한곳 main은 os로 던져죽음
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {2,2,2,2};
        try {
            copy(arrayA,arrayB);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(arrayA));

        int[] arrayC = copy(arrayA);
        System.out.println("[arrayC]");
        System.out.println(Arrays.toString(arrayC));
    }

    public static void copy(int[] a,int[] b) throws ArrayIndexOutOfBoundsException {
        if (a.length != b.length){
            throw new ArrayIndexOutOfBoundsException("길이가 다릅니다.");
        }

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static int[] copy(int[] src){
        int[] newArr = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            newArr[i] = src[i];
        }
        return newArr;
    }

}
