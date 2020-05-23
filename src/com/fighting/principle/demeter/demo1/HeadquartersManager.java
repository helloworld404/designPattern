package com.fighting.principle.demeter.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 修改打印总部员工的类
 * @Author LiuXing
 * @Date 2020/05/20 22:12
 */
public class HeadquartersManager {

    //返回公司总部的员工
    public List<HeadquartersEmployee> getAllEmployee() {
        List<HeadquartersEmployee> list = new ArrayList<>();
        //增加5个员工到 list
        for (int i = 0; i < 5; i++) {
            HeadquartersEmployee emp = new HeadquartersEmployee();
            emp.setId("公司总部员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    //输出公司总部和分部员工信息(id)
    public void printAllEmployee(BranchManager sub) {
        //分析问题
        //1. BranchEmployee 不是 HeadquartersManager 的直接朋友
        //2. BranchEmployee 是以局部变量方式出现在 HeadquartersManager
        //3. 违反了 迪米特法则
        //获取到分部员工
        List<BranchEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------公司分部员工------------");
        for (BranchEmployee e : list1) {
            System.out.println(e.getId());
        }
        //获取到公司总部员工
        List<HeadquartersEmployee> list2 = this.getAllEmployee();
        System.out.println("------------公司总部员工------------");
        for (HeadquartersEmployee e : list2) {
            System.out.println(e.getId());
        }
    }
}
