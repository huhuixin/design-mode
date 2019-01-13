package com.hhx.design.pattern.computer.oper;

import com.hhx.design.pattern.computer.Operation;

import java.math.BigDecimal;

/**
 * 加法
 * @author hhx
 */
public class HexSub implements Operation {


    /**
     * 加法
     * @param num1
     * @param num2
     * @return 和
     */
    @Override
    public BigDecimal getResult(BigDecimal num1, BigDecimal num2) throws IllegalArgumentException {
        return new BigDecimal(Integer.parseInt(Integer.toString(num1.intValue()), 16)
                - Integer.parseInt(Integer.toString(num2.intValue()), 16));
    }
}
