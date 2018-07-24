package com.xupt.edu.design.proxy;

/**
 * @author: zhaowanyue
 * @date: 2018/7/24
 * @description:目标对象角色
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}