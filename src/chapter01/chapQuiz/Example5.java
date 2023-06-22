package chapter01.chapQuiz;

public class Example5 {
    // 별피라미드
    public static void main(String[] args) {
      spira(10);
    }

    public static void spira(int n){
        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--) {
                System.out.printf(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
