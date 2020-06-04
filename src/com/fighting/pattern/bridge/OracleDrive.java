package com.fighting.pattern.bridge;
/**
* @Description 具体实现类：Oracle驱动
* @Author: LiuXing
* @Date: 2020/5/28 21:32
*/
public class OracleDrive implements Drive {
    @Override
    public void buildDrive(String language) {
        System.out.println(language + "的Oracle驱动");
    }
}
