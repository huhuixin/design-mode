package com.hhx.design.principle.demeter;

/**
 * @author hhx
 */
public class Manager2 {
    public void releaseTask(String plan) {
        Employ employ = new Employ();
        employ.work(plan);
    }
}
