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
 * 双重检查加锁
 * 所谓“双重检查加锁”机制，指的是：并不是每次进入getInstance方法都需要同步，而是先不同步，进入方法后，
 * 先检查实例是否存在，如果不存在才进行下面的同步块，这是第一重检查，进入同步块过后，再次检查实例是否存在，
 * 如果不存在，就在同步的情况下创建一个实例，这是第二重检查。这样一来，就只需要同步一次了，从而减少了多次
 * 在同步情况下进行判断所浪费的时间。
 *
 *
 * “双重检查加锁”机制的实现会使用关键字volatile，它的意思是：被volatile修饰的变量的值，
 * 将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
 *
 *
 * 这种实现方式既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。
 * 它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
 */
public class Singleton {
    private static volatile Singleton instance=null;
    private Singleton ()
    {

    }
    public static Singleton getInstance()
    {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance==null)
        {
            //同步块，线程安全的创建实例
            synchronized (Singleton.class)
            {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance==null)
                {
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
