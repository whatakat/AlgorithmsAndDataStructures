package com.company;

public class MyArr {
    //work with primitive
   /* private int[] arr;
    private int size;
    public MyArr(int size){
        this.size = 0  ;
        this.arr = new int[size];
    }
    public void display(){
        for (int i = 0; i <this.size ; i++) {
            System.out.println(this.arr[i]);
        }
    }
    public void delete(int value){
        int i =0;
        for (i = 0; i <this.size ;i ++) {
            if (this.arr[i]==value)break;
        }
        for (int j = i; j <this.size-1 ; j++) {
            this.arr[j]=this.arr[j+1];
        }
        this.size--;
    }
    public void insert(int value){
        int i;
        for (i = 0;  i<this.size ; i++) {
            if (this.arr[i]>value)
                break;
        }
        for (int j = this.size; j >i ; j--) {
            this.arr[j]=this.arr[j-1];
        }
        this.arr[i]=value;
        this.size++;
    }
    //liner method
    public boolean find(int value){
        int i;
        for (i = 0; i <this.size ; i++) {
            if (this.arr[i]==value)break;
        }
        if (i==this.size)
            return false;
        else
            return true;
    }
    //binary find
    public boolean binaryFind(int value){
        int low = 0;
        int high = this.size-1;
        int mid;
        while (low<high){
            mid=(low+high)/2;
            if (value==this.arr[mid]){
                return true;
            }else {
                if (value<this.arr[mid]){
                    high = mid;
                }else {
                    low=mid+1;
                }
            }
        }
        return false;
    }*/
//reference data type
    private Person[] arr;
    private int size;
    public MyArr(int size){
        this.size = 0;
        this.arr= new Person[size];
    }
    public boolean find(String search){
        int i;
        for (i = 0;  i<this.size ;i ++) {
            if (this.arr[i].getName().equals(search)) break;
        }
        if (i==this.size)
            return false;
        else
            return true;
    }
    public void display(){
        for (int i = 0; i <this.size ; i++) {
            System.out.println(this.arr[i].getName()+" "+this.arr[i].getAge());
        }
    }
    public void delete(String search){
        int i = 0;
        for (i = 0; i <this.size ; i++) {
            if (this.arr[i].getName().equals(search)) break;
        }
        for (int j = i; j <this.size-1 ; j++) {
            this.arr[j]=this.arr[j+1];
        }
        this.size--;
    }
    public void insert(String name, int age){
        this.arr[this.size] = new Person(name,age);
        this.size++;
    }
    /* SORT BUBBLE
    public void sortBubble(){
        int out, in;
        for (out = this.size-1; out>1 ; out--) {
            for (in = 0; in <out ;in ++) {
                if (this.arr[in]>this.arr[in+1]){
                    change(in,in+1);
                }
            }
        }
    }
    public void change(int a, int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }
*/
    //SELECTION SORTING
    /*
    public void sortSelect(){
        int out, in, mark;
        for (out = 0;  out<this.size ; out++) {
            mark =out;
            for ( in = out+1; in <this.size ; in++) {
                if (this.arr[in]<this.arr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
            
        }
    }*/
    public void sortInsertObj(){
        int in, out;
        for (out = 1; out <this.size ; out++) {
            Person tmp = this.arr[out];
            in = out;
            while (in>0&&this.arr[in-1].getName().compareTo(tmp.getName())>0){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in]=tmp;

        }
    }

}
