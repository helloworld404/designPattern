package com.fighting.pattern.composite;

/**
 * @Description 组合模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class CompositeTest {
    public static void main(String[] args) {
        Borough province = new Province("河南省");
        Borough nanyang = new City("南阳市");
        Borough xinyang = new City("信阳市");
        Borough tongbai = new County("桐柏县");
        Borough xinye = new County("新野县");
        Borough gushi = new County("固始县");
        Borough luoshan = new County("罗山县");

        nanyang.add(tongbai);
        nanyang.add(xinye);
        xinyang.add(gushi);
        xinyang.add(luoshan);
        province.add(nanyang);
        province.add(xinyang);

        province.print();

    }
}
