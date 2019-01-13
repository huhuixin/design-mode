package com.hhx.design.pattern.computer.standard.factory;

import com.hhx.design.pattern.computer.Operation;
import com.hhx.design.pattern.computer.oper.Add;
import com.hhx.design.pattern.computer.oper.Sub;
import com.hhx.design.pattern.computer.standard.IOperationFactory;

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
