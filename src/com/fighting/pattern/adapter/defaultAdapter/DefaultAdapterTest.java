package com.fighting.pattern.adapter.defaultAdapter;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/26 23:44
 */
public class DefaultAdapterTest {

    public static void main(String[] args) {
        // 1、原来要实现所有操作类的操作
        Computer computer = new Computer();
        computer.setUSB(new USB() {
            @Override
            public void charge() {
                System.out.println("充电");
            }

            @Override
            public void transferFiles() {

            }

            @Override
            public void keyboard() {

            }

            @Override
            public void mouse() {

            }
        });
        computer.charge();

        // 2、使用缺省适配器只需要实现需要用到的接口方法
        Computer computer2 = new Computer();
        computer2.setUSB(new USBAdapter() {
            @Override
            public void charge() {
                System.out.println("充电");
            }
        });

        computer2.charge();
    }
}
