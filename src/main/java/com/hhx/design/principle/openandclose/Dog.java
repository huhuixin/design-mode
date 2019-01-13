package com.hhx.design.principle.openandclose;

/**
 * 动物抽象
 * @author hhx
 */
public class Dog implements Animal{

    @Override
    public Integer getId() {
        return 1;
    }

    @Override
    public String getName() {
        return "狗";
    }
}
