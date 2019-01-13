package com.hhx.design.principle.demeter;

/**
 * @author hhx
 */
public class Boss2 {
    public void plan(Manager2 manager, String plan){
        manager.releaseTask(plan);
    }
}
