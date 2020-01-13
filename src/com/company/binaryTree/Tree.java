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
    private void inOrder(Node rootNode){
        if (rootNode!=null){
            inOrder(rootNode.leftChild);
            rootNode.display();
            inOrder(rootNode.rightChild);
        }
    }
    public Node min(){
        Node current, last = null;
        current = root;
        while (current!=null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }
    public Node max(){
        Node current, last=null;
        current = root;
        while (current!=null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }
    public boolean delete(int id) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.person.id != id) {
            parent = current;
            if (id < current.person.id) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        //change line
    }


}
