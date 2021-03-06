package com.company.linkedList;

public class LinkedList {
    private Link first;
    private Link last;
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
    public void display(){
        Link current = first;
        while (current!=null){
            current.display();
            current = current.next;
        }
    }
    public Link find(String name){
        Link current = first;
        while (current.name != name){
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
    public Link delete(String name){
        Link current = first;
        Link previous = first;
        while (current.name != name){
            if (current.next==null)
                return null;
            else {
                previous = current;
                current= current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }
    public void insertLast(String name, int age){
        Link newLink = new Link(name, age);
        if (this.isEmpty()){
            first=newLink;
        }else {
            last.next = newLink;
        }
        last = newLink;
    }
    public Link getFirst(){
        return first;
    }
    public void setFirst(Link first){
        this.first = first;
    }
    public LinkIterator getIterator(LinkedList list){
        return new LinkIterator(this);

    }
}
