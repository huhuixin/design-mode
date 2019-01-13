package com.hhx.design.principle.singleresponsibility;

/**
 * @author hhx
 */
public class AImpl1 implements AB{
    @Override
    public void methodA(String a) {
        System.out.println(a);
    }
    @Override
    public void methodB(String b) {
        return;
    }
}
