package com.hhx.design.proxy.example1;

/**
 * test
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Secretary secretary = new Secretary(new Boss());
        secretary.meeting();
    }
}
