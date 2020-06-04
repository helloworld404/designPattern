package com.fighting.pattern.iterator;

import java.util.Iterator;

public class HeNanProvinceIterator implements Iterator {

    City[] citys;
    int position = 0; //遍历的位置

    public HeNanProvinceIterator(City[] citys){
        this.citys = citys;
    }


    @Override
    public boolean hasNext() {
        if (position >= citys.length || citys[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        City city = citys[position];
        position++;
        return city;
    }
}
