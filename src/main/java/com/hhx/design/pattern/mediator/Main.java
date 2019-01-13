package com.hhx.design.pattern.mediator;

import java.util.Arrays;

/**
 * test
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Market 家乐福 = new Market(Arrays.asList(new Factory("玩具"), new Factory("文具")));
        User 小明 = new User("小明");
        小明.setMarket(家乐福);
        小明.buy();
    }
}
