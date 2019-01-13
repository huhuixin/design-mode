package com.hhx.design.principle.demeter;

/**
 * @author hhx
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manager = new Manager();
        boss.plan(manager, "5万亿");
    }
}
