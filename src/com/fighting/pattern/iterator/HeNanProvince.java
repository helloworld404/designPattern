package com.fighting.pattern.iterator;

import java.util.Iterator;

public class HeNanProvince implements Province {

    City [] citys;
    int citysize = 0;

    public HeNanProvince(){
        citys = new City[5];
        addCity("郑州");
        addCity("洛阳");
        addCity("南阳");
    }

    @Override
    public String getName() {
        return "河南省";
    }

    @Override
    public void addCity(String name) {
        City city = new City(name);
        citys[citysize++] = city;
    }

    @Override
    public Iterator createIterator() {
        return new HeNanProvinceIterator(citys);
    }
}
