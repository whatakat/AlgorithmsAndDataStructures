package com.company.linkedList;

public class LinkedList {
    private Link first;
    public LinkedList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insert(String name, int age){
        Link newLink = new Link(name, age);
        newLink.next=first;
        first = newLink;
    }
    public Link delete(){
        Link temp = first;
        first = first.next;
        return temp;

    }
}
