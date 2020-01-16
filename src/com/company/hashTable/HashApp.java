package com.company.hashTable;

import java.io.IOException;

public class HashApp {
    public static void main(String[] args) throws IOException {
        Item aDataItem;
        int aKey, size, n, keysPerCell;
        System.out.println("Enter size of hash table: ");
        size = getInt();
        System.out.println("Enter initial number of items: ");
        n = getInt();




    }
    public int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
