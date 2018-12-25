package com.hhx.design.factory.computer.standard;

import com.hhx.design.factory.computer.oper.Add;
import com.hhx.design.factory.computer.oper.Sub;
import com.hhx.design.factory.computer.standard.factory.AddFactory;
import com.hhx.design.factory.computer.standard.factory.SubFactory;
import com.hhx.utils.InputUtil;

import java.math.BigDecimal;

/**
 * 工厂模式
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        IOperationFactory factory;
        String oper = InputUtil.enter("运算符", "+-*/"::contains);
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
                        new BigDecimal(InputUtil.enterNumber("第一个数字")),
                        new BigDecimal(InputUtil.enterNumber("第二个数字"))));
    }
}
