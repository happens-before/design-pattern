package com.xupt.edu.design.singleton;

/**
 * @author: zhaowanyue
 * @date: 2018/7/24
 * @description:单例模式
 */

/**
 * 单例模式的特点：
   1.单例类只能有一个实例。
   2.单例类必须自己创建自己的唯一实例。
   3.单例类必须给所有其他对象提供这一实例
 */

/**
 * 饿汉式单例
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，
 * 先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 */
public class EagerSingleton {
    private static EagerSingleton singleton=new EagerSingleton();
    //私有默认构造
    private EagerSingleton()
    {

    }
    //静态工厂方法
    public  static EagerSingleton getInstance()
    {

        return singleton;
    }
}
