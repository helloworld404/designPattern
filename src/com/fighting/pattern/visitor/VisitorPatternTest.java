package com.fighting.pattern.visitor;

/**
 * @Description 访问者模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class VisitorPatternTest<main> {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
