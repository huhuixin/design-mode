package com.hhx.design.factory.computer.abst;

import com.hhx.design.factory.computer.Operation;
import com.hhx.design.factory.computer.abst.factory.HexFactory;
import com.hhx.design.factory.computer.abst.factory.TenFactory;
import com.hhx.utils.InputUtil;
import com.hhx.utils.SupplierUtil;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 抽象工厂, 经典应用: 数据库的切换
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        SupplierUtil.forever(() -> {
            // 将不同的产品抽离出不同的抽象类,如果要切换类别只需要切换抽象类即可
            IFactory factory = InputUtil.choose("进制",
                    Arrays.asList(new HexFactory(), new TenFactory()));
            Operation operation;
            String oper = InputUtil.enter("运算符", "+-*/"::contains);
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
                    new BigDecimal(InputUtil.enterNumber("第一个数字")),
                    new BigDecimal(InputUtil.enterNumber("第二个数字"))));
            return null;
        });
    }
}
