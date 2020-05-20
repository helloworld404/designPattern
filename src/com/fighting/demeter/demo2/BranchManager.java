package com.fighting.demeter.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 修改分部员工的类
 * @Author LiuXing
 * @Date 2020/05/20 22:12
 */
public class BranchManager {
    //返回分部的所有员工
    public List<BranchEmployee> getAllEmployee() {
        List<BranchEmployee> list = new ArrayList<BranchEmployee>();
        //这里我们增加了 10 个员工到 list
        for (int i = 0; i < 10; i++) {
            BranchEmployee emp = new BranchEmployee();
            emp.setId("公司分部员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    //输出分部员工的信息
    public void printEmployee() {
        //获取到分部员工
        List<BranchEmployee> list1 = getAllEmployee();
        System.out.println("------------公司分部员工------------");
        for (BranchEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}