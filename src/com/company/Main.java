package com.company;

import com.company.sortArr.MyArr;

public class Main {

    public static void main(String[] args) {

//        MyArr arr = new MyArr(10);
//        arr.insert(5);
//        arr.insert(2);
//        arr.insert(3);
//        arr.insert(4);
//        arr.insert(6);
//        arr.insert(7);
//        arr.insert(8);
//        arr.insert(9);
//        arr.insert(10);
//        arr.insert(1);
//        int search = 8;
//        System.out.println(arr.binaryFind(search));
        int size = 100;
        MyArr myArr = new MyArr(size);
        myArr.insert("Vasya", 10);
        myArr.insert("Igor",15);
        myArr.insert("Leo", 5);
        myArr.display();
        myArr.sortInsertObj();
        myArr.display();



    }
}
