package com.fighting.pattern.prototype.deepclone;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class DeepCloneTest {

    public static void main(String[] args) {

        Person person = new Person("刘行","19940628");
        person.parent = new Parent("xx","xx");

        //方式1
        Person person1 = (Person)person.clone();
        Person person2 = (Person)person.clone();
        Person person3 = (Person)person.clone();

        System.out.println("person = " + person + "--- person.parent=" + person.parent.hashCode());
        System.out.println("person1 =" + person1 + "--- person1.parent=" + person1.parent.hashCode());
        System.out.println("person2 =" + person2 + "--- person2.parent=" + person2.parent.hashCode());
        System.out.println("person3 =" + person3 + "--- person3.parent=" + person3.parent.hashCode());

        //方式2
        Person person11 = (Person)person.deepClone();
        Person person22 = (Person)person.deepClone();
        Person person33 = (Person)person.deepClone();

        System.out.println("person = " + person + "--- person.parent=" + person.parent.hashCode());
        System.out.println("person11 =" + person11 + "--- person11.parent=" + person11.parent.hashCode());
        System.out.println("person22 =" + person22 + "--- person22.parent=" + person22.parent.hashCode());
        System.out.println("person33 =" + person33 + "--- person33.parent=" + person33.parent.hashCode());
    }
}
