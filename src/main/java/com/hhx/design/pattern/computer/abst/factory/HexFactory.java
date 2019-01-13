package com.hhx.design.pattern.computer.abst.factory;

import com.hhx.design.pattern.computer.Operation;
import com.hhx.design.pattern.computer.abst.IFactory;
import com.hhx.design.pattern.computer.oper.HexAdd;
import com.hhx.design.pattern.computer.oper.HexSub;

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
