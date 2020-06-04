package com.fighting.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class GuangDongProvinceIterator implements Iterator {

    List<City> citys;
    int index = -1;

    public GuangDongProvinceIterator(List<City> citys) {
        this.citys = citys;
    }


    @Override
    public boolean hasNext() {
        if (index >= citys.size() - 1)
            return false;
        else {
            index++;
            return true;
        }

    }

    @Override
    public Object next() {
        return citys.get(index);
    }
}
