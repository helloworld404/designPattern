package com.fighting.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GunangDongProvince implements Province{

    List<City> citys;

    public GunangDongProvince(){
        citys = new ArrayList<>();
        addCity("广州");
        addCity("深圳");
        addCity("东莞");
    }

    @Override
    public String getName() {
        return "广东省";
    }

    @Override
    public void addCity(String name) {
        City city = new City(name);
        citys.add(city);
    }

    @Override
    public Iterator createIterator() {
        return new GuangDongProvinceIterator(citys);
    }
}
