package chapter02.example;

public class ArrayEqual {

    public static void main(String[] args) {
        int[] arrayA = {10, 73, 2, -5, 42};
        int[] arrayB = {10, 73, 2, -5, 42};

        System.out.println(arrayIsSame(arrayA,arrayB));


    }

    public static boolean arrayIsSame(int[] arr01, int[] arr02) {
//      초반에 길이로 자를때
        if (arr01.length != arr02.length) {
            return false;
        }
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] != arr02[i]) {
                return false;
            }
        }
        return true;
    }

}
