package com.hhx.design.factory.computer.simple;

import com.hhx.design.factory.computer.Operation;
import com.hhx.design.factory.computer.oper.Add;
import com.hhx.design.factory.computer.oper.Sub;

/**
 * 决定使用哪种方法
 *
 * @author hhx
 */
public class OperationFactory {

    public static Operation getOperation(String oper){
        switch (oper){
            // 如果新增运算方式需要修改原有的类的case块,这违反了开闭原则中的 '对修改关闭' 原则
            case "+":
                return new Add();
            case "-":
                return new Sub();
            default:
                throw new IllegalArgumentException("不合法的运算符: " + oper);
        }

    }
}
