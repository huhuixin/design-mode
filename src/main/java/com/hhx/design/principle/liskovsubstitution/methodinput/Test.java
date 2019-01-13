package com.hhx.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author hhx
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
