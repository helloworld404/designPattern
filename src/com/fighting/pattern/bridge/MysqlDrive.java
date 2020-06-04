package com.fighting.pattern.bridge;
/**
* @Description 具体实现类：MySql驱动
* @Author: LiuXing
* @Date: 2020/5/28 21:32
*/
public class MysqlDrive implements Drive {
    @Override
    public void buildDrive(String language) {
        System.out.println(language + "的MySql驱动");
    }
}
