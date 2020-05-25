package com.fighting.pattern.prototype.shallowCopy;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/24 23:12
 */
public class Person implements Cloneable{

    private String name;

    private String birthday;

    public Person parent;//是对象, 默认是浅拷贝

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

    @Override
    protected Object clone(){
        Person person = null;
        try {
            person = (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return person;
    }
}
