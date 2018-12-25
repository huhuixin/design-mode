package com.hhx.design.factory.computer.standard;

import com.hhx.design.factory.computer.Operation;

/**
 * 抽象工厂类
 *
 * @author hhx
 */
public interface IOperationFactory {
    Operation createOperation();
}
