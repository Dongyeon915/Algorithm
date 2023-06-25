package chapter02.example.string;

public class Example01 {

    public static void main(String[] args) {
        String name = "김";
        name = name.concat("동연");
        System.out.println(name);

        boolean value = name.contains("12");
        System.out.println(value);

//        name.endsWith("연")

        String str03 = String.format("Hello, %s! %d\n", name, 100);
        System.out.println(String.join("|", "Dong", "20", "34.1"));
        System.out.println(String.join("|", "Dong", "20", "34.1"));
        System.out.println(String.join("|", "Dong", "20", "34.1"));
        System.out.println(String.join("|", "Dong", "20", "34.1"));


        System.out.println("      Hello".length());
        System.out.println("      Hello".trim().length());
    }
}
