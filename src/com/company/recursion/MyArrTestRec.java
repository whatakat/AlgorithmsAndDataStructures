package com.company.recursion;

public class MyArrTestRec {
    public static void main(String[] args) {
        MyArrRecursion arr = new MyArrRecursion(10);
        arr.insert(-10);
        arr.insert(45);
        arr.insert(40);
        arr.insert(69);
        arr.insert(80);
        arr.insert(48);
        arr.insert(15);
        arr.insert(34);
        arr.insert(70);
        arr.insert(26);

        int search = -10;
        System.out.println(arr.binaryFind(search));
    }
}
