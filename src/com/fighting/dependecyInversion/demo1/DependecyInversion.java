package com.fighting.dependecyInversion.demo1;

public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
