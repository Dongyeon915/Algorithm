package chapter04.stack;

import java.util.Arrays;
import java.util.Stack;

public class MyStack02 {

    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(5);
        for (int i = 0; i < 5; i++) {
             myStack.push(i);
        }
        System.out.println(myStack.indexOf(1));
        System.out.println(myStack.indexOf(3));

        System.out.println(myStack.get(1));
        System.out.println(myStack.get(3));


//        ArrayStack02<Boolean> myStack02 = new ArrayStack02<>(20);
//        for (int i = 0; i < 10; i++) {
//            myStack02.push(true);
//        }
//        for (int i = 0; i < 10; i++) {
//           boolean value = myStack02.pop();
//            System.out.println(value);
//        }

    }
}
