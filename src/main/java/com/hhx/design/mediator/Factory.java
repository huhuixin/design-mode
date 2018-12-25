package com.hhx.design.mediator;

/**
 * 工厂
 *
 * @author hhx
 */
public class Factory {
    private String product;
    public Factory(String product) {
        this.product = product;
    }
    public String getProduct(){
       return this.product;
    }
}
