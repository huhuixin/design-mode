package com.hhx.design.principle.dependencyinversion;

/**
 * @author hhx
 */
public class Panda2 {
    public void eatPandaFood(PandaFood pandaFood){
        System.out.println("eat " + pandaFood.getFoodName());
    }
}
