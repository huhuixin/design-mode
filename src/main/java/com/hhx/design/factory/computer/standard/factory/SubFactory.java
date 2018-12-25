package com.hhx.design.factory.computer.standard.factory;

import com.hhx.design.factory.computer.Operation;
import com.hhx.design.factory.computer.oper.Add;
import com.hhx.design.factory.computer.oper.Sub;
import com.hhx.design.factory.computer.standard.IOperationFactory;

/**
 * 加法工厂
 *
 * @author hhx
 */
public class SubFactory implements IOperationFactory {

    @Override
    public Operation createOperation() {
        return new Sub();
    }
}