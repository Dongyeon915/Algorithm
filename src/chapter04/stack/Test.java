package chapter04.stack;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        System.out.println(fibo(15));
    }

    public static int fibo(int n) {
        if (n > 0) return n * fibo(n-1);
        return 1;
    }
}
