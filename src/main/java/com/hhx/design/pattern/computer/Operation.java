package com.hhx.design.pattern.computer;

import java.math.BigDecimal;

/**
 * 运算符
 * @author hhx
 */
public interface Operation {

    /**
     * 通过给定的两个值返回一个其他的值
     * @param num1
     * @param num2
     * @return
     * @throws IllegalArgumentException
     */
    BigDecimal getResult(BigDecimal num1, BigDecimal num2) throws IllegalArgumentException;
}
