package com.fighting.principle.demeter.demo1;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/20 22:51
 */
public class Demeter {

    public static void main(String[] args) {
        //创建HeadquartersManager 对象
        HeadquartersManager headquartersManager = new HeadquartersManager();
        // 输出分部的员工 id 和 公司总部的员工信息
        headquartersManager.printAllEmployee(new BranchManager());
    }
}
