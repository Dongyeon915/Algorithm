package chapter01.chapQuiz;

public class Example2 {
// 왼쪽 위가 직각인 이등변삼각형
    public static void main(String[] args) {
       trianglebLU(10);
    }

    public static void trianglebLU(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
