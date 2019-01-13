package com.hhx.design.pattern.builder;

/**
 * 建造者
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Target targetA = new Target.BuilderA(8).build();
        System.out.println(targetA);
        Target targetB = new Target.BuilderB("hh").build();
        System.out.println(targetB);
    }
}
