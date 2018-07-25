package com.xupt.edu.design.factory;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class IntelCpu implements Cpu {
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
