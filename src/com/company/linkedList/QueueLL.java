package com.company.linkedList;

public class QueueLL {
    private LinkedList queue;
    public QueueLL(){
        queue = new LinkedList();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void insert(String name, int age){
        queue.insert(name, age);
    }
    public Link delete(){
        return queue.delete();
    }
    public void display(){
        queue.display();
    }

}
