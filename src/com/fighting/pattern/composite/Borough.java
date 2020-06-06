package com.fighting.pattern.composite;

/**
 * @Description 组织机构
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public abstract class Borough {

    private String name;

    public Borough(String name){
        this.name = name;
    }

    protected void add(Borough borough){}

    protected void remove(Borough borough){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //方法 print, 做成抽象的, 子类都需要实现
    protected abstract void print();

}
