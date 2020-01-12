package com.company.recursion;

public class MyArrTestRec {
    public static void main(String[] args) {
        MyArrRecursion arr = new MyArrRecursion(9);
        arr.insert(-10);
        arr.insert(45);
        arr.insert(40);
        arr.insert(69);
        arr.insert(4);
        arr.insert(48);
        arr.insert(10);
        arr.insert(34);
        arr.insert(70);


        int search = 10;
        System.out.println(arr.binaryFind(search));
    }
}
