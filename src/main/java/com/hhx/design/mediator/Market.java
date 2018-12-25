package com.hhx.design.mediator;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 超市,从厂商进货然后卖给用户 解耦了 用户与 工厂的关联关系
 *
 * @author hhx
 */
public class Market {

    private List<Factory> factories;

    public Market(List<Factory> factories) {
        this.factories = factories;
    }

    public List<String> getProducts(){
        return factories.stream().map(Factory::getProduct).collect(Collectors.toList());
    }
}
