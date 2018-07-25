package com.xupt.edu.design.factory;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class ComputerEngineer {
    private Cpu cpu=null;
    private Mainboard mainboard=null;
    public   void makeComputer(AbstractFactory abstractFactory)
    {
        prepareHardwares(abstractFactory);
    }

    private void prepareHardwares(AbstractFactory abstractFactory) {
        this.cpu=abstractFactory.createCpu();
        this.mainboard=abstractFactory.createMainboard();
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
