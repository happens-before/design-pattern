package com.xupt.edu.design.factory;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class AmdCpu implements Cpu {
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
