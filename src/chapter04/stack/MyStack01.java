package chapter04.stack;

import java.util.Scanner;

public class MyStack01 {
// 메소드마다 각 변수가지고 있다.
    public static void main(String[] args) {
        int a = 100;
        double b = 30.140;
        boolean c = true;
        myPrint(10);
        System.out.println("Hello");
        int f = 0;
        System.out.println(f);
    }

    public static void myPrint(int a) {
        boolean f = false;
//      heap영역과 같이 생성된다.`
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        System.out.println(data);
    }
}
