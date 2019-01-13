package com.hhx.design.principle.demeter;

/**
 * @author hhx
 */
public class Test2 {
    public static void main(String[] args) {
        Boss2 boss = new Boss2();
        Manager2 manager = new Manager2();
        boss.plan(manager, "5万亿");
    }
}
