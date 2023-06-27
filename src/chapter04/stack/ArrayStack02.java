package chapter04.stack;

import java.util.EmptyStackException;

public class ArrayStack02<Type> {

    private Type[] myDoubleStack;
    private int count = 0;

    public ArrayStack02(int length) {
        this.myDoubleStack = (Type[]) new Object[length];
    }

    public ArrayStack02(Type[] array) {
        this.myDoubleStack = array;
    }

    // empty() - Stackreturn type : boolean
    public boolean empty() {
        if (this.count == 0) {
            return true;
        }
        return false;
    }

    // count를 인덱스로 관리해서 올리기
    // push() - Parameter: double, return type: x
    public void push(Type num) {
        if (count == myDoubleStack.length) {
            // throw new RuntimeException("Stack is Full!!!");
            System.out.println("Stack is Full!!!");
            return;
        }
        this.myDoubleStack[count] = num;
        count++;
    }

    // pop() return type: double
    public Type pop() {
        if (!empty())  {
            count--;
            return this.myDoubleStack[count];
        }
        throw new EmptyStackException();
    }

    // peek() - Stack의 Top에 위치한 값
    public Type peek() {
        if (empty()){
            throw new EmptyStackException();
        }
        return this.myDoubleStack[count - 1];
    }
}
