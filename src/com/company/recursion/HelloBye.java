package com.company.recursion;

public class HelloBye {
    public static void main(String[] args) {
        hello("Artem");

    }
    public static void hello(String name){
        System.out.println("Hello! "+name);
        bye(name);
    }
    public static void bye(String name){
        System.out.println("Bye! "+name);
    }
}
