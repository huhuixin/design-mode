package com.hhx.design.state;

/**
 * 状态模式
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile("18611551449", 3);
        while(true){
            mobile.call("110");
        }
    }

}
