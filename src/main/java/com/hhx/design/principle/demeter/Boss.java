package com.hhx.design.principle.demeter;

/**
 * @author hhx
 */
public class Boss {
    public void plan(Manager manager, String plan){
        Employ employ = new Employ();
        manager.releaseTask(employ, plan);
    }
}
