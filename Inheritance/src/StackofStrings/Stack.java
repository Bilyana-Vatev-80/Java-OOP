package StackofStrings;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    private ArrayDeque<String> data;

    public Stack (){
        this.data = new ArrayDeque<>();
    }
    public void push (String element) {
        this.data.push(element);
    }
    public String pop(){
        return this.data.pop();
    }
    public String peek(){
        return this.data.peek();
    }
    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
