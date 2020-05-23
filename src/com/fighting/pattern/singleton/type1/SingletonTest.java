package com.fighting.pattern.singleton.type1;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/21 23:03
 */
public class SingletonTest {
    public static void main(String[] args) {
        //测试
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person1 == person2); // true
        System.out.println("person1.hashCode=" + person1.hashCode());
        System.out.println("person2.hashCode=" + person2.hashCode());
    }
}
