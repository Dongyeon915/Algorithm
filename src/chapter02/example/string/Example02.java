package chapter02.example.string;

public class Example02 {

    public static void main(String[] args) {
        String str = "HOLLOLLOLLO";
        int num = 0;

//     인덱스 자리
        int findIndex = str.indexOf("L");

        while (findIndex != -1) {
            num += 1;
            findIndex++;
            findIndex = str.indexOf("L", findIndex);
        }

        System.out.println(num);
    }
}
