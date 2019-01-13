package com.hhx.design.pattern.computer.standard;

import com.hhx.design.pattern.computer.Operation;

/**
 * 抽象工厂类
 *
 * @author hhx
 */
public interface IOperationFactory {
    Operation createOperation();
}
