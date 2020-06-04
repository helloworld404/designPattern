package com.fighting.pattern.template;

/**
 * @Description 模板模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class TemplateTest {
    public static void main(String[] args) {
        Person ordinary = new Ordinary();
        ordinary.daily();
        Person owl = new OWL();
        owl.daily();
    }
}
