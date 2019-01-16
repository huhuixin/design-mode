package com.hhx.design.pattern.creational.abstractfactory;

/**
 * @author hhx
 */
public class Test {
    public static void main(String[] args) {
        BrandFactory factory = new BenzFactory();
        SaloonCar saloonCar = factory.getSaloonCar();
        SuvCar suvCar = factory.getSuvCar();
        System.out.println(saloonCar.getCar());
        System.out.println(suvCar.getCar());
    }
}
