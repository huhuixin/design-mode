package com.hhx.design.principle.demeter;

/**
 * @author hhx
 */
public class Manager {
    public void releaseTask(Employ employ, String plan) {
        employ.work(plan);
    }
}
