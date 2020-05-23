package com.fighting.principle.dependecyInversion.demo2;

public class Person {
    //这里是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
