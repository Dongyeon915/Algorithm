package chapter01.chapQuiz;

import java.util.Scanner;

public class Example1 {
// 왼쪽아래가 직각인 이등변 삼각형
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        trianglebLB(scanner.nextInt());
    }

    public static void trianglebLB(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
