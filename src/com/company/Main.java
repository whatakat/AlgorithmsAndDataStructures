package com.company;

public class Main {

    public static void main(String[] args) {
        //delete element in arrays
        int[] myArr = {1,2,3,4,5,2};
        int i;
        int len = myArr.length;
        int serch = 4;
        for (int j = 0; j <len ; j++) {
            System.out.print(myArr[j]);
        }
        for (i = 0; i <len ; i++) {
            if (myArr[i]==serch) break;
        }
        for (int j = i; j <len-1 ; j++) {
            myArr[j]=myArr[j+1];
        }
        len--;
        System.out.println();
        for (int j = 0; j <len ; j++) {
            System.out.print(myArr[j]);
            
        }
        //**********************************************

    }
}
