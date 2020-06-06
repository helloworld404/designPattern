package com.fighting.pattern.flyweight;

/**
 * @Description 具体的电脑实体类
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class HaseeComputer implements Computer {

    private String size;
    private String cpu;
    private String ssd;
    private String ram;

    public HaseeComputer(String size){
        this.size = size;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void showInfo() {
        System.out.println("HaseeComputer{" +
                "size='" + size + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", ram='" + ram + '\'' +
                '}');
    }

}
