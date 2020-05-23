package com.fighting.pattern.singleton.type4;

/**
 * @Description 懒汉式（线程安全，同步方法）
 * @Author LiuXing
 * @Date 2020/05/21 23:04
 */
public class Person {

    //1.本类内部创建对象实例
    private static Person person;

    //2. 构造器私有化, 外部不能new
    private Person() {}

    // 3. 提供一个公有的静态方法，当使用到该方法时，才去创建
    // 加入同步处理的代码，解决线程安全问题
    public static synchronized Person getPerson() {
        if(person == null ){
            person = new Person();
        }
        return person;
    }
}
