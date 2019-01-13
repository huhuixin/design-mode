package com.hhx.design.principle.dependencyinversion;

/**
 * @author hhx
 */
public class Test1 {
    public static void main(String[] args) {
        Panda1 panda = new Panda1();
        panda.eatBambooLeaves();
        panda.eatBambooShoots();
    }
}
