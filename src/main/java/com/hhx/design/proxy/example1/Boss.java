package com.hhx.design.proxy.example1;

/**
 * 老板
 *
 * @author hhx
 */
public class Boss implements BossInterface{

    /**
     * 开会
     */
    @Override
    public void meeting() {
        System.out.println("大家来开会");
    }
}
