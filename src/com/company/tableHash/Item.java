package com.company.tableHash;

public class Item {
    private int data;
    public Item(int data){
        this.data = data;
    }
    public int getKey(){
        return this.data;
    }
}
