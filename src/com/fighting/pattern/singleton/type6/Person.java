package com.fighting.pattern.singleton.type6;

/**
 * @Description 双重检查
 * @Author LiuXing
 * @Date 2020/05/21 23:04
 */
public class Person {

    //1.本类内部创建对象实例
    private static Person person;

    //2. 构造器私有化, 外部不能new
    private Person() {}

    // 3. 写一个静态的共有方法,加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static synchronized Person getPerson() {
        if (person == null){
            synchronized (Person.class){
                if (person ==null){
                    person = new Person();
                }
            }
        }
        return person;

    }
}
