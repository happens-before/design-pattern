package com.xupt.edu.design.factory;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
