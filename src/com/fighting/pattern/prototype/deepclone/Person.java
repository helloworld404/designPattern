package com.fighting.pattern.prototype.deepclone;

import java.io.*;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/24 23:12
 */
public class Person implements Serializable, Cloneable {

    private String name;

    private String birthday;

    public Parent parent;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    //深拷贝式1 使用 clone 方法
    @Override
    protected Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
            //对引用类型的属性进行克隆
            person.parent = (Parent) parent.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return person;
    }

    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Person person = (Person) ois.readObject();
            return person;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        } finally {

            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
