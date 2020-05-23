package com.fighting.pattern.singleton.type2;

/**
 * @Description 饿汉式(静态代码块)
 * @Author LiuXing
 * @Date 2020/05/21 23:04
 */
public class Person {

    //1.本类内部创建对象实例
    private static Person person;

    //2. 构造器私有化, 外部不能new
    private Person() {}

    static { // 在静态代码块中，创建单例对象
        person = new Person();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Person getPerson() {
        return person;
    }
}
