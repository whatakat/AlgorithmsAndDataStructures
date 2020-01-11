package com.company.linkedList;

public class LinkQueueApp {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.insert("Artem", 30);
        q.insert("Viktor", 20);
        q.insert("Sergey", 10);
        q.display();
        while (!q.isEmpty()){
            System.out.println("Element: "+q.delete()+" deleted from list");
        }
    }
}
