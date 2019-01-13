package com.hhx.design.principle.dependencyinversion;

/**
 * @author hhx
 */
public class Test2 {
    public static void main(String[] args) {
        Panda2 panda = new Panda2();
        PandaFood leaves = new BambooLeaves();
        PandaFood shoots = new BambooShoots();
        panda.eatPandaFood(leaves);
        panda.eatPandaFood(shoots);
    }
}
