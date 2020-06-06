package com.fighting.pattern.flyweight;

import java.util.HashMap;

/**
 * @Description 电脑工厂
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class ComputerFactory {

    private static final HashMap<String,Computer> computerMap = new HashMap<>();

    public static Computer getComputer(String size){
        HaseeComputer computer = (HaseeComputer)computerMap.get(size);

        if (computer == null){
            computer = new HaseeComputer(size);
            computerMap.put(size,computer);
            System.out.println("造了一个 "+ size + "的笔记本");
        }

        return computer;
    }
}
