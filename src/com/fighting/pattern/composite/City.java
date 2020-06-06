package com.fighting.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 市
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class City extends Borough {

    //List
    List<Borough> boroughs = new ArrayList<Borough>();

    public City(String name) {
        super(name);
    }

    @Override
    protected void add(Borough borough) {
        boroughs.add(borough);
    }

    @Override
    protected void remove(Borough borough) {
        boroughs.remove(borough);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println(getName());
        for (Borough borough : boroughs){
            borough.print();
        }
    }
}
