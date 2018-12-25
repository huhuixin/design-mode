package com.hhx.design.factory.computer.abst;

import com.hhx.design.factory.computer.Operation;

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
