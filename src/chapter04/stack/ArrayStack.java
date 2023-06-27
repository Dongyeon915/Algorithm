package chapter04.stack;

import java.util.EmptyStackException;

public class ArrayStack {

    private double[] myDoubleStack;
    private int count = 0;

    public ArrayStack(int length) {
        this.myDoubleStack = new double[length];
    }

    public ArrayStack(double[] array) {
        this.myDoubleStack = array;
    }

    // empty() - Stackreturn type : booleanㅅ  -
    public boolean empty() {
        if (this.count == 0) {
            return true;
        }
        return false;
    }

    // count를 인덱스로 관리해서 올리기
    // push() - Parameter: double, return type: x
    public void push(double num) {
        if (count == myDoubleStack.length) {
            // throw new RuntimeException("Stack is Full!!!");
            System.out.println("Stack is Full!!!");
            return;
        }
        this.myDoubleStack[count] = num;
        count++;
    }

    // pop() return type: double
    public double pop() {
        if (!empty())  {
            count--;
            return this.myDoubleStack[count];
        }
        throw new EmptyStackException();
    }

    // peek() - Stack의 Top에 위치한 값
    public double peek() {
        if (empty()){
            throw new EmptyStackException();
        }
        return this.myDoubleStack[count - 1];
    }
    
//   검색 indexOf
    public int indexOf(double num){
        for (int i = count - 1; i >= 0; i--) {
            if (myDoubleStack[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public double get(int idx) {
        return myDoubleStack[idx];
    }
}
