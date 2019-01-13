package com.hhx.design.pattern.computer.abst.factory;

import com.hhx.design.pattern.computer.Operation;
import com.hhx.design.pattern.computer.abst.IFactory;
import com.hhx.design.pattern.computer.oper.Add;
import com.hhx.design.pattern.computer.oper.Sub;

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