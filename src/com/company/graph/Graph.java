package com.company.graph;


public class Graph {
    private final int MAX_VERTS = 32;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int size;
    private Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        for (int i = 0; i <MAX_VERTS ; i++) {
            for (int j = 0; j <MAX_VERTS ; j++) {
                adjMat[i][j] = 0;
            }
        }
    }
    public void addVertex(char label){
        vertexList[size++]=new Vertex(label);
    }
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start]= 1;
    }
    public void displayVertex(int vertex){
        System.out.println(vertexList[vertex]);
    }
    public int getAdjUnvisitedVertex(int ver ){
        for (int i = 0; i <size ; i++) {
            if (adjMat[ver][i]==1 && vertexList[i].wasVisited==false){
                return i;
            }
        }
        return -1;
    }
}
