package com.company.queues;

import java.util.Arrays;

public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);

        while (!q.isEmpty()){
            int n = q.remove();
            System.out.print(n+" ");

        }

    }
}
