package com.company.hashTable;

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
    public int hashFunc(int key){
        return key%=arrSize;
    }
    public void insert(Item item){
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null && hashArr[hashVal].getKey()!= -1){
            ++hashVal;
            hashVal%=arrSize;
        }
        hashArr[hashVal] = item;
    }
}
