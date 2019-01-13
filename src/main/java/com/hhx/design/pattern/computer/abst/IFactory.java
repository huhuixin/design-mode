package com.hhx.design.pattern.computer.abst;

import com.hhx.design.pattern.computer.Operation;

import java.math.BigDecimal;

/**
 * 抽象工厂模式
 *
 * @author hhx
 */
public interface IFactory {
    Operation add();
    Operation sub();
}
