package com.fighting.pattern.singleton.type7;

import java.io.Serializable;

/**
 * @Description 静态内部类
 * @Author LiuXing
 * @Date 2020/05/21 23:04
 */
public class Person implements Serializable {

    //1. 构造器私有化, 外部不能new
    private Person() {}

    // 2. 写一个静态内部类,该类中有一个静态属性 PERSON
    private static class SingletonInstance{
        private static final Person PERSON = new Person();
    }

    //3 提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static synchronized Person getPerson() {
        return SingletonInstance.PERSON;
    }
}
