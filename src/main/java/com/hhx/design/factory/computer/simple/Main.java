package com.hhx.design.factory.computer.simple;

import com.hhx.design.factory.computer.Operation;
import com.hhx.utils.InputUtil;
import com.hhx.utils.SupplierUtil;

import java.math.BigDecimal;

/**
 * Main
 * 实现一个计算器
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        SupplierUtil.forever(() -> {
            String num1 = InputUtil.enterNumber("第一个数字");
            String oper = InputUtil.enter("操作符", "+-*/"::contains);
            String num2 = InputUtil.enterNumber("第二个数字");
            Operation operation = OperationFactory.getOperation(oper);
            BigDecimal result = operation.getResult(new BigDecimal(num1), new BigDecimal(num2));
            System.out.println(num1 + " " + oper + " " + num2 + " = " + result.toString());
            return null;
        });
    }
}
