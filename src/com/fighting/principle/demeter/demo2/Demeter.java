package com.fighting.principle.demeter.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/20 22:51
 */
public class Demeter {

    public static void main(String[] args) {
        System.out.println("~~~使用迪米特法则的改进~~~");
        HeadquartersManager headquartersManager = new HeadquartersManager();
        //输出分部的员工 id 和 公司总部的员工信息
        headquartersManager.printAllEmployee(new BranchManager());
    }
}
