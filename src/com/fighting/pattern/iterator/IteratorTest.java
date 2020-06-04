package com.fighting.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 迭代器模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class IteratorTest {

    public static void main(String[] args) {
      List<Province> provinces = new ArrayList<>();

        HeNanProvince heNanProvince = new HeNanProvince();
        GunangDongProvince gunangDongProvince = new GunangDongProvince();
        provinces.add(heNanProvince);
        provinces.add(gunangDongProvince);
        OutPutImpl outPut = new OutPutImpl(provinces);
        outPut.print();

    }
}
