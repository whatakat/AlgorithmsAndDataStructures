package com.company.binaryTree;

public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while (current.person.id!=key){
            if (key<current.person.id){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }
            if (current ==null){
                return null;
            }
        }
        return current;

    }
    public void insert(Person person){

    }
    public boolean delete(int id){

    }
    public void displayTree(){

    }
}
