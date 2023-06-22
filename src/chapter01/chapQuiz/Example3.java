package chapter01.chapQuiz;

public class Example3 {
    // 오른쪽 아래가 직각인 이등변삼각형
    public static void main(String[] args) {
        trianglebRU(5);
    }

    public static void trianglebRU(int n){
        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
