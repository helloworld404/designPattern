package com.fighting.pattern.singleton.type1;

/**
 * @Description 饿汉式(静态变量)
 * @Author LiuXing
 * @Date 2020/05/21 23:04
 */
public class Person {

    //1. 构造器私有化, 外部不能new
    private Person() {}

    //2.本类内部创建对象实例
    private final static Person person = new Person();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Person getPerson() {
        return person;
    }
}
