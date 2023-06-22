package chapter01.chapQuiz;

public class Example4 {
    // 오른쪽 위가 직각인 이등변삼각형
    public static void main(String[] args) {
        trianglebRB(5);
    }

    public static void trianglebRB(int n){
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}