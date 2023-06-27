package chapter04.stack;

import java.util.EmptyStackException;

public class ArrayQueue {

    private double[] myDoubleQueue;
    private int position = 0;
    private int count = 0;

    public ArrayQueue(int length) {
        this.myDoubleQueue = new double[length];
    }

    // empty() - Stackreturn type : booleanㅅ  -
    public boolean empty() {
        if (this.count == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(double num) {
        if (count == myDoubleQueue.length) {
            // throw new RuntimeException("Stack is Full!!!");
            System.out.println("Queue is Full!!!");
            return;
        }
        this.myDoubleQueue[count] = num;
        count++;
    }

    // pop() return type: double
    public double dequeue() {
        if (count != 0) {
            double removeValue = myDoubleQueue[0];
//          count 길이에서 뺴줘야 카운트가 준다.
            count --;
//          count 앞에꺼를 뒤로 넣어주기
            for (int i = 0; i < count; i++) {
                myDoubleQueue[i] = myDoubleQueue[i + 1];
            }
            return removeValue;
        }
        return -1;
    }

    // peek() - Stack의 Top에 위치한 값
    public double first() {
        if (empty()){
            throw new EmptyStackException();
        }
        return this.myDoubleQueue[0];
    }

    public double last() {
        if (empty()){
            throw new EmptyStackException();
        }
//      없을때는 카운트가 0이므로-1이될수있다.
        return this.myDoubleQueue[count - 1];
    }
    
//   검색 indexOf
    public int indexOf(double num){
        for (int i = 0; i < count; i++) {
            if (myDoubleQueue[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public double get(int idx) {
        return myDoubleQueue[idx];
    }
}
