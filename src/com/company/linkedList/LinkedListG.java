package com.company.linkedList;

public class LinkedListG<T> {
    private LinkG<T> first;
    public LinkedListG(){
        first = null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insert(T link){
        LinkG<T> l = new LinkG<>(link);
        l.setNext(first);
        this.first = l;
    }
    public LinkG<T> delete(){
        LinkG<T> temp = first;
        first = first.getNext();
        return temp;
    }
    public void display(){
        LinkG<T> current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public T find(T searchNode){
        LinkG<T> findNode = new LinkG<>(searchNode);
        LinkG<T> current  = first;
        while (current !=null){
            if (current.getValue().equals(findNode.getValue())){
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

}
