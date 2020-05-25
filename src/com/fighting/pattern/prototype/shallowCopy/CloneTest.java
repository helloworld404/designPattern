package com.fighting.pattern.prototype.shallowCopy;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/24 23:03
 */
public class CloneTest {

    public static void main(String[] args) {

        Person person = new Person("刘行","19940628");
        person.parent = new Person("xx","xx");

        Person person1 = (Person)person.clone();
        Person person2 = (Person)person.clone();
        Person person3 = (Person)person.clone();

        System.out.println("person = " + person + "--- person.parent=" + person.parent.hashCode());
        System.out.println("person1 =" + person1 + "--- person1.parent=" + person1.parent.hashCode());
        System.out.println("person2 =" + person2 + "--- person2.parent=" + person2.parent.hashCode());
        System.out.println("person3 =" + person3 + "--- person3.parent=" + person3.parent.hashCode());
    }
}
