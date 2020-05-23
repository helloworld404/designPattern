package com.fighting.principle.demeter.demo2;

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

        //1. 将输出分部的员工方法，封装到 BranchManager
        sub.printEmployee();

        //获取到公司总部员工
        List<HeadquartersEmployee> list2 = this.getAllEmployee();
        System.out.println("------------公司总部员工------------");
        for (HeadquartersEmployee e : list2) {
            System.out.println(e.getId());
        }
    }
}
