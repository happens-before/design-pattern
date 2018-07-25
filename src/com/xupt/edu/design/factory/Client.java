package com.xupt.edu.design.factory;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:抽象工厂
 */
public class Client {
    public static void main(String[] args)
    {
        ComputerEngineer computerEngineer=new ComputerEngineer();
        AbstractFactory abstractFactory=new IntelFactory();
        computerEngineer.makeComputer(abstractFactory);
    }
}
