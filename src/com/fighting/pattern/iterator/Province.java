package com.fighting.pattern.iterator;

import java.util.Iterator;

public interface Province {

    public String getName();
    //增加系的方法
    public void addCity(String name);
    //返回一个迭代器,遍历
    public Iterator createIterator();
}
