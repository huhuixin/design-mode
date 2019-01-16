package com.hhx.design.pattern.creational.factorymethod.car;

/**
 * @author hhx
 */
public class Test {
    public static void main(String[] args) {
        SaloonFactory saloonFactory = new BenzSaloonFactory();
        SuvFactory suvFactory = new VwSuvFactory();
        SaloonCar saloonCar = saloonFactory.getSaloonCar();
        SuvCar suvCar = suvFactory.getSuvCar();
        System.out.println(saloonCar.getCar());
        System.out.println(suvCar.getCar());
    }
}
