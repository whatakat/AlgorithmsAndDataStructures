package com.company.queues;

import java.io.IOException;

public class PriorityApp {
    public static void main(String[] args) throws IOException {
        PriorityQueue q = new PriorityQueue(5);
        q.insert(30);
        q.insert(50);
        q.insert(10);
        q.insert(40);
        q.insert(20);
        while (!q.isEmpty()){
            int item = q.remove();
            System.out.print(item+" ");
        }
        System.out.println("");

    }
}
