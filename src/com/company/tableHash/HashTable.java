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
    public void display(){
        for (int i = 0; i <arrSize ; i++) {
            if (hashArr[i]!=null){
                System.out.println(hashArr[i].getKey());
            }else {
                System.out.println("***");
            }
        }
    }
}
