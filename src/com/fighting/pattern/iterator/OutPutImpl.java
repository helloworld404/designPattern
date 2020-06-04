package com.fighting.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    List<Province> provinces;

    public OutPutImpl(List<Province> provinces){
        this.provinces = provinces;
    }

    public void print(){
        Iterator<Province> iterator = provinces.iterator();
        while (iterator.hasNext()){
            Province province = iterator.next();
            System.out.println("===" + ""+province.getName()+"===");
            printCity(province.createIterator());
        }
    }

    public void printCity(Iterator iterator){
        while (iterator.hasNext()){
            City city = (City)iterator.next();
            System.out.println(city.getName());
        }
    }
}
