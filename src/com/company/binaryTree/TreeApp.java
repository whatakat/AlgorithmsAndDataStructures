package com.company.binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();
        theTree.insert(new Person());
        theTree.insert(new Person());
        theTree.insert(new Person());
        theTree.insert(new Person());
        theTree.insert(new Person());
        theTree.insert(new Person());
        theTree.insert(new Person());
        theTree.insert(new Person());
        while (true){
            System.out.println("Enter first  letter of show, ");
            System.out.println("insert, find, delete, or traverse: ");
            int choise = getChar();
            switch (choise){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.println("Enter value to insert: ");
                    value = getint();
                    theTree.insert(new Person());
                    break;
                case 'f':
                    System.out.println("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found !=null){
                        System.out.println("Found: ");
                    }
                    found.display();
                    System.out.println("/n");
                    break;
            }
        }
    }
    public static String getString() throws IOException{
        InputStreamReader ist = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ist);
        String s = br.readLine();
        return s;
    }

}
