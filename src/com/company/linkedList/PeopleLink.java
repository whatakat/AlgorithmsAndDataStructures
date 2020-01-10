package com.company.linkedList;

import java.util.Objects;

public class PeopleLink {
    private String name;
    private int age;

    public PeopleLink(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = hash*53+ Objects.hashCode(this.name);
        hash = hash*53+this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (this==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        final PeopleLink other = (PeopleLink)obj;
        if (this.age != other.age){
            return false;
        }
        if (!Objects.equals(this.name, other.name)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+", age: "+this.age;
    }
}
