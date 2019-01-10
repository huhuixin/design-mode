package com.hhx.design.factory.computer.simple;

import com.hhx.design.factory.computer.Operation;

import java.math.BigDecimal;

/**
 * Main
 * 实现一个计算器
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        String num1 = "1";
        String oper = "+";
        String num2 = "2";
        Operation operation = OperationFactory.getOperation(oper);
        BigDecimal result = operation.getResult(new BigDecimal(num1), new BigDecimal(num2));
        System.out.println(num1 + " " + oper + " " + num2 + " = " + result.toString());
    }
}
