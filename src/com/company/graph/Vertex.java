package com.company.graph;

public class Vertex {
    public char label;
    public boolean wasVisited;
    public Vertex(char label){
        this.label = label;
        this.wasVisited = false;
    }
    public String toString(){
        return "vertex "+label;
    }
}
