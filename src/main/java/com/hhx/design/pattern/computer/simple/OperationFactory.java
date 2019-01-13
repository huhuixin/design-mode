package com.hhx.design.pattern.computer.simple;

import com.hhx.design.pattern.computer.Operation;
import com.hhx.design.pattern.computer.oper.Add;
import com.hhx.design.pattern.computer.oper.Sub;

/**
 * 决定使用哪种方法
 *
 * @author hhx
 */
public class OperationFactory {

    /**
     * 每次增加新的运算还要修改静态方法
     * @param oper
     * @return
     */
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

    /**
     * 通过反射实现
     * @param clazz
     * @return
     */
    public static Operation getOperation2(Class<? extends Operation> clazz){
        Operation operation = null;
        try {
            operation = (Operation) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return operation;
    }
}
