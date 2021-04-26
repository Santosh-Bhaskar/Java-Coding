package com.company;

public class PrintNameusingGetterFunction {
    public static void main(String[] args) {

        Person("Ankit");
        System.out.println(Person.getName());
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
