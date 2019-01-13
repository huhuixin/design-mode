package com.hhx.design.pattern.computer.simple;

import com.hhx.design.pattern.computer.Operation;
import com.hhx.design.pattern.computer.oper.Add;

import java.math.BigDecimal;

/**
 * Main
 * 实现一个计算器
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        BigDecimal num1 =new BigDecimal("1");
        String oper = "+";
        BigDecimal num2 =new BigDecimal("2");
        Operation operation = OperationFactory.getOperation(oper);
        BigDecimal result = operation.getResult(num1, num2);
        System.out.println(num1 + " " + oper + " " + num2 + " = " + result.toString());
        operation = OperationFactory.getOperation2(Add.class);
        result = operation.getResult(num1, num2);
        System.out.println(num1 + " " + oper + " " + num2 + " = " + result.toString());
    }
}
