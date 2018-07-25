package com.xupt.edu.design.factory;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class IntelFactory  implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
