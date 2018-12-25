package com.hhx.design.factory.computer.abst.factory;

import com.hhx.design.factory.computer.Operation;
import com.hhx.design.factory.computer.abst.IFactory;
import com.hhx.design.factory.computer.oper.Add;
import com.hhx.design.factory.computer.oper.Sub;

/**
 * 十进制
 *
 * @author hhx
 */
public class TenFactory implements IFactory {

    @Override
    public Operation add() {
        return new Add();
    }

    @Override
    public Operation sub() {
        return new Sub();
    }

    @Override
    public String toString() {
        return "十进制";
    }
}