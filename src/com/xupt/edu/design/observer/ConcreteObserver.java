package com.xupt.edu.design.observer;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class ConcreteObserver implements Observer {
    private  String observerState;
    @Override
    public void update(String state) {
        observerState=state;
        System.out.println("状态为："+observerState);
    }
}
