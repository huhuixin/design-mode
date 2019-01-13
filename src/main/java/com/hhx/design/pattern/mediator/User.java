package com.hhx.design.pattern.mediator;

import java.util.stream.Collectors;

/**
 * yonghu
 *
 * @author hhx
 */
public class User {

    private String name;

    private Market market;

    public User(String name) {
        this.name = name;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public void buy(){
        System.out.println(name + "购买" + market.getProducts().stream().collect(Collectors.joining("和")));
    }
}
