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
        Node node = new Node();
        node.person= person;
        if (root==null) {
            root = node;
        }else {
            Node current=root;
            Node parent;
            while (true){
                parent=current;
                if (person.id<current.person.id){
                    current=current.leftChild;
                    if (current==null){
                        parent.leftChild=node;
                        return;
                    }
                    else{
                        current=current.rightChild;
                        if (current==null){
                            parent.rightChild=node;
                            return;
                        }
                    }
                }
            }
        }

    }
    public boolean delete(int id){

    }
    public void displayTree(){

    }
}
