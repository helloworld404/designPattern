package com.fighting.pattern.builder;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:25
*/
public class Computer {

    private String cpu;
    private String ram;
    private String hdd;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void showInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
