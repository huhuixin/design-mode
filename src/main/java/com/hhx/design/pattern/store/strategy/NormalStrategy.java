package com.hhx.design.pattern.store.strategy;

import com.hhx.design.pattern.store.CashStrategy;

/**
 * 原价收费
 *
 * @author hhx
 */
public class NormalStrategy implements CashStrategy {

    /**
     * 根据指定策略返回实际的收费值
     * @param money
     * @return
     */
    @Override
    public double cash(double money) {
        return money;
    }

    @Override
    public String toString() {
        return "无折扣";
    }
}
