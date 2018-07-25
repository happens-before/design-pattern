package com.xupt.edu.design.observer;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public class Client {
    public static void main(String[] args)
    {
        //继承用具体
        ConcreteSubject subject=new ConcreteSubject();
        //实现用抽象
        Observer observer=new ConcreteObserver();
        subject.attach(observer);
        subject. change("new state");
    }
}
