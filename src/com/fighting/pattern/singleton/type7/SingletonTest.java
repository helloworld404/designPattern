package com.fighting.pattern.singleton.type7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @Description 静态内部类
 * @Author LiuXing
 * @Date 2020/05/21 23:03
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {
        System.out.println("静态内部类~");
        //测试
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person1 == person2); // true
        System.out.println("person1.hashCode=" + person1.hashCode());
        System.out.println("person2.hashCode=" + person2.hashCode());

        Class<Person> clazz = (Class<Person>)Class.forName("com.fighting.pattern.singleton.type7.Person");
        Constructor<Person> con = clazz.getDeclaredConstructor(null);
        con.setAccessible(true);

        Person person11 = con.newInstance();
        Person person22 = con.newInstance();
        System.out.println("通过反射破解：");
        System.out.println(person11 == person22); // false
        System.out.println("person11.hashCode=" + person11.hashCode());
        System.out.println("person22.hashCode=" + person22.hashCode());
        System.out.println("person11=" + person11);
        System.out.println("person22=" + person22);

        //此种方法测试时 实体类Person实现Serializable接口
        FileOutputStream fos = new FileOutputStream( "D:/person.txt" );
        ObjectOutputStream oos = new ObjectOutputStream( fos );
        oos.writeObject( person1 );
        oos.close();
        fos.close();
        System.out.println("通过序列化反序列化破解：");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/person.txt"));
        Person person3 = (Person)ois.readObject();
        System.out.println(person1 == person3); // true
        System.out.println("person1.hashCode=" + person1.hashCode());
        System.out.println("person3.hashCode=" + person3.hashCode());
        System.out.println("person1=" + person1);
        System.out.println("person3=" + person3);
    }

}
