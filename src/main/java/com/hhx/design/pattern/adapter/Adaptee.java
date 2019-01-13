package com.hhx.design.pattern.adapter;

/**
 * 第三方提供的接口(需要适配的接口)
 *
 * @author hhx
 */
public class Adaptee {

    public void specialRequest(){
        System.out.println("第三方接口");
    }
}
