package chapter05.example01;

public class Recursive {

    public static void main(String[] args) {
        // 0! = 1
        // n! = n * (n-1)!
        System.out.println(factorial(3));
        System.out.println(factorial(6));

        System.out.println("[myMethod01]");
        myMethod01(3);

        System.out.println("[myMethod02]");
        myMethod02(3);

        System.out.println("[myMethod03]");
        myMethod03(3);

        System.out.println("[factorial02]");
        System.out.println(factorial02(3));

        System.out.println("[Hanoi]");
        // hanoi01(2, 1, 3);
        hanoi01(3, 1, 3);
//        hanoi01(2, 1, 2);
//        hanoi01(2, 2, 3);

        square(22, 8);
        square(16, 8);
    }

    //   1.뭘 전달할까!?
    //  2. 종료 조건
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int factorial02(int n) {
        // 3! = 3 * 2 * 1
        int result = 1;
        for (int i = n; i > 0; i--) {
            System.out.println(i);
            result = result * i;
        }
        return result;
    }

    public static int factorial03(int n) {
        // 3! = 3 * 2 * 1
        //    = 1 * 2 * 3
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void myMethod01(int n) {
        if (n == 0) return;
        System.out.println(n);
        myMethod01(n - 1);
    }

    public static void myMethod02(int n) {
        if (n == 0) return;
        myMethod02(n - 1);
        System.out.println(n);
    }

    public static void myMethod03(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // 최소공배수 (GCM)
    // 2 vs 13
    // 13, 26
    // 2 vs 12  -> 12

    // 최대공약수 (GCD
    // 3 vs 9
    // 3: 1, 3
    // 9, 1, 3, 9
    // 3
    public static void hanoi01(int n, int from, int to) {
        if (n == 0) return;
        //   hanoi01(2, 1, 2);
        hanoi01(n - 1, from,  6 - from - to);
        System.out.printf("%d (%d -> %d)\n", n, from, to);
        //   hanoi01(2, 2, 3);
        hanoi01(n - 1, 6 - from - to, to);
    }

    public static void square(int x, int y) {
        if (x % y == 0) {
            System.out.println(y);
            return;
        }
        square(y, x % y);
    }
}
