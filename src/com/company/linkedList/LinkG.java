package com.company.linkedList;

public class LinkG<T> {
    private T link;
    private LinkG<T> next;

    public LinkG(T link){
        this.link = link;
    }
    public LinkG<T> getNext(){
        return next;
    }
    public void setNext(LinkG<T> next){
        this.next = next;
    }
    public T getValue(){
        return link;
    }
}
