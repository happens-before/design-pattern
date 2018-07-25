package com.xupt.edu.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/7/25
 * @description:
 */
public abstract class Subject {
    private List<Observer> list=new ArrayList<Observer>();
    public void attach(Observer observer)
    {
        list.add(observer);
        System.out.println("Attached an observer");
    }
    public void detach(Observer observer)
    {
        list.remove(observer);
    }
    public void notifyObservers(String newState)
    {
        for(Observer observer:list)
        {
            observer.update(newState);
        }
    }
}
