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
 * 懒汉式单例
 * 懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。
 * 当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间.
 　由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。
 */
public class LazySingleton {
    private static LazySingleton instance=null;
    //私有默认构造
    private LazySingleton()
    {

    }
    //静态工厂方法
    public static synchronized LazySingleton getInstance()
    {
        if(instance == null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }
}

