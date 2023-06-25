package chapter02.example;

public class Example5 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int sum = sumValue(array);
        System.out.println(sum);
    }

    public static int sumValue(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
