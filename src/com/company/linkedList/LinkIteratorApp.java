package com.company.linkedList;

public class LinkIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iterator = new LinkIterator(list);
        iterator.insertAfter("Artem",20);
        iterator.insertBefore("Sergey", 10);
        list.display();
    }
}
