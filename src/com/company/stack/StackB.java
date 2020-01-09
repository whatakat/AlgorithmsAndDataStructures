package com.company.stack;

public class StackB {
    private int maxSize;
    private char[] stackArr;
    private int top;
    public StackB(int size){
        this.maxSize = size;
        this.stackArr = new char[size];
        this.top= -1;
    }
    public void push(char i){
        stackArr[++top]=i;
    }
    public char pop(){
        return stackArr[top--];
    }
    public boolean isEmpty(){
        return (top==-1);
    }

}
