package com.fighting.pattern.adapter.classAdapter;

/**
* @Description 天朝插排实现接口
* @Author: LiuXing
* @Date: 2020/5/26 23:25
*/
public class ChinaSocket implements ChinaSocketInterface {
    @Override
    public void chargeByTwoRectangle() {
        System.out.println("天朝插排使用矩形两头的插孔供电");
    }
}
