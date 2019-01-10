package com.hhx.design.factory.computer.standard;

import com.hhx.design.factory.computer.standard.factory.AddFactory;
import com.hhx.design.factory.computer.standard.factory.SubFactory;

import java.math.BigDecimal;

/**
 * 工厂模式
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        IOperationFactory factory;
        String oper = "+";
        // 工厂模式将原有工厂类中判断逻辑转移到了客户端中, 并对用户屏蔽了实现的细节
        // 只暴露的工厂方法
        switch (oper){
            case "+":
                factory = new AddFactory();
                break;
            case "-":
                factory = new SubFactory();
                break;
            default:
                throw new IllegalArgumentException("不合法的运算符: " + oper);
        }
        System.out.println(factory.createOperation().getResult(
                        new BigDecimal("1"),
                        new BigDecimal("2")));
    }
}
