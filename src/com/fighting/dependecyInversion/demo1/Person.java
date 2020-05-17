package com.fighting.dependecyInversion.demo1;

public class Person {

    public void receive(Email email ) {
        System.out.println(email.getInfo()); }
}
