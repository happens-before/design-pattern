package com.xupt.edu.design.proxy;

/**
 * @author: zhaowanyue
 * @date: 2018/7/24
 * @description:客户端
 */
//代理对象将客户端的调用委派给目标对象，在调用目标对象的方法之前跟之后都可以执行特定的操作。
public class Client {
    public static void main(String[] args) {

        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
