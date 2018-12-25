package com.hhx.design.factory.computer.abst.factory;

import com.hhx.design.factory.computer.Operation;
import com.hhx.design.factory.computer.abst.IFactory;
import com.hhx.design.factory.computer.oper.HexAdd;
import com.hhx.design.factory.computer.oper.HexSub;

/**
 * 十进制
 *
 * @author hhx
 */
public class HexFactory implements IFactory {

    @Override
    public Operation add() {
        return new HexAdd();
    }

    @Override
    public Operation sub() {
        return new HexSub();
    }

    @Override
    public String toString() {
        return "十六进制";
    }
}
