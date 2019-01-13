package com.hhx.design.pattern.decorator.example1;

/**
 * 程序员
 *
 * @author hhx
 */
public class Programmer implements Employee{

    /**
     * 员工职责
     */
    @Override
    public void doSth() {
        System.out.println("软件开发");
    }
}
