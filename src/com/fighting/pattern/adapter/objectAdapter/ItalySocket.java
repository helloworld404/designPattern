package com.fighting.pattern.adapter.objectAdapter;

/**
 * @Description 意大利插排实现接口
 * @Author: LiuXing
 * @Date: 2020/5/26 23:26
 */
public class ItalySocket implements ItalySocketInterface {
    @Override
    public void chargeByTwoRound() {
        System.out.println("意大利插排使用圆形两头的插孔供电");
    }
}
