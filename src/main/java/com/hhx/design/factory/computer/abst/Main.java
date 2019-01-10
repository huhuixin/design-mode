package com.hhx.design.factory.computer.abst;

import com.hhx.design.factory.computer.Operation;
import com.hhx.design.factory.computer.abst.factory.HexFactory;

import java.math.BigDecimal;

/**
 * 抽象工厂, 经典应用: 数据库的切换
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        // 将不同的产品抽离出不同的抽象类,如果要切换类别只需要切换抽象类即可
        //  new TenFactory()
        IFactory factory = new HexFactory();
        Operation operation;
        // +-*/
        String oper = "+";
        switch (oper){
            case "+":
                operation = factory.add();
                break;
            case "-":
                operation = factory.sub();
                break;
            default:
                throw new IllegalArgumentException("不合法的运算符: " + oper);
        }
        System.out.println(operation.getResult(
                new BigDecimal("1"),
                new BigDecimal("2")));
    }
}
