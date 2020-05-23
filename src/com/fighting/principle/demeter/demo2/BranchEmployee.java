package com.fighting.principle.demeter.demo2;

/**
 * @Description 公司分部员工实体类
 * @Author LiuXing
 * @Date 2020/05/20 22:12
 */
public class BranchEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
