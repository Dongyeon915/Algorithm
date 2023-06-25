package chapter02.example.string;

public class StringExample01 {

    public static void main(String[] args) {
        String str01 = "Hello World!";
        char[] hello = {'H', 'e', 'l', 'l', 'o'};
        String str02 = new String(hello, 0, hello.length);

    }
}
