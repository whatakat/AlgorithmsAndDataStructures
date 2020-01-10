package com.company.linkedList;

public class GenericListApp {
    public static void main(String[] args) {
        LinkedListG<String> list = new LinkedListG<>();
        list.insert("Artem");
        list.insert("Vartan");
        System.out.println(list.find("Artem"));

        LinkedListG<PeopleLink> peopleList = new LinkedListG<>();
        peopleList.insert(new PeopleLink("Andrey",22));
        peopleList.insert(new PeopleLink("Roman",33));
        System.out.println(peopleList.find(new PeopleLink("Roman",33)).toString());
    }
}
