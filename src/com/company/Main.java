package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyArr arr = new MyArr(10);
        arr.insert(5);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(6);
        arr.insert(7);
        arr.insert(8);
        arr.insert(9);
        arr.insert(10);
        arr.insert(1);
        arr.display();
        arr.delete(10);
        arr.display();



    }
}
