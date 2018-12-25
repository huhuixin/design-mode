package com.hhx.design.adapter;

/**
 * 适配器,适配第三方接口,为用户提供专有接口
 *
 * @author hhx
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 标准请求
     */
    @Override
    public void request() {
        System.out.print("适配器适配");
        adaptee.specialRequest();
    }
}
