package com.company.tableHash;

public class HashTable {
    private Item[] hashArr;
    private int arrSize;
    private Item nonItem;
    public HashTable(int size){
        this.arrSize = size;
        hashArr = new Item[arrSize];
        nonItem = new Item(-1);
    }
}
