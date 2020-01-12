package com.company.recursion;

import java.io.IOException;

public class AnagrammApp {
    static int size;
    static int count;
    static char[] arr = new char[3];

    public static void main(String[] args) throws IOException {
        String input = getString();
    }
    public static void getAnagramm(int newSize){
        if (newSize ==1)
            return;
        for (int i = 0; i <newSize ; i++) {
            getAnagramm(newSize-1);
            if (newSize==2)
                display();
            rotate(newSize);
        }
    }
    public static void rotate(int newSize){
        int i;
        int pos = size - newSize;
        char temp = arr[pos];
        for ( i = pos+1; i <size ; i++) {
            arr[i-1] =arr[i];
        }
        arr[i-1]=temp;
    }
}
