package com.fighting.pattern.flyweight;

/**
 * @Description 享元模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class FlyweightTest {

    private static final String sizes[] = {"13寸","14寸","15寸","17寸"};
    private static final String cpus[] = {"i3","i5","i7","i9"};
    private static final String rams[] = {"4G","8G","16G","32G"};
    private static final String ssds[] = {"250G","500G","1T","2T"};

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++){
            HaseeComputer hasee = (HaseeComputer) ComputerFactory.getComputer(getSize());
            hasee.setCpu(getCpu());
            hasee.setRam(getRam());
            hasee.setSsd(getSSD());
            hasee.showInfo();
        }
    }

    private static String getSize(){
        return sizes[(int)(Math.random()*sizes.length)];
    }

    private static String getCpu(){
        return cpus[(int)(Math.random()*cpus.length)];
    }

    private static  String getRam(){
        return rams[(int)(Math.random()*rams.length)];
    }

    private static String getSSD(){
        return ssds[(int)(Math.random()*ssds.length)];
    }
}
