package com.company.hashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashApp {
    public static void main(String[] args) throws IOException {
        Item aDataItem;
        int aKey, size, n, keysPerCell;
        System.out.println("Enter size of hash table: ");
        size = getInt();
        System.out.println("Enter initial number of items: ");
        n = getInt();




    }
    public String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;

    }
    public int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
