package com.fighting.pattern.singleton.type8;

/**
 * @Description 枚举
 * @Author LiuXing
 * @Date 2020/05/21 23:03
 */
public class SingletonTest {
    public static void main(String[] args){
        System.out.println("枚举~");

        Person person1 = Person.INSTANCE;
        Person person2 = Person.INSTANCE;
        System.out.println(person1 == person2); // true
        System.out.println("person1.hashCode=" + person1.hashCode());
        System.out.println("person2.hashCode=" + person2.hashCode());
    }
}
