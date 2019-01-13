package com.hhx.design.principle.dependencyinversion;

/**
 * @author hhx
 */
public class Panda3 {

    private PandaFood pandaFood;

    public Panda3(PandaFood pandaFood) {
        this.pandaFood = pandaFood;
    }

    public void setPandaFood(PandaFood pandaFood) {
        this.pandaFood = pandaFood;
    }

    public void eatPandaFood(){
        System.out.println("eat " + pandaFood.getFoodName());
    }
}
