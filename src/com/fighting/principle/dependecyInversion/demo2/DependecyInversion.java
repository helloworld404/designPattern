package com.fighting.principle.dependecyInversion.demo2;

public class DependecyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}
