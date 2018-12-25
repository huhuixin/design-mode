package com.hhx.design.strategy.store.strategy;

import com.hhx.design.strategy.store.CashStrategy;

/**
 * 折扣收费
 *
 * @author hhx
 */
public class RebateStrategy implements CashStrategy {

    private Integer rebate;

    public RebateStrategy(Integer rebate) {
        if(rebate > 10 || rebate < 0){
            throw new IllegalArgumentException("错误的折扣价!");
        }
        this.rebate = rebate;
    }

    /**
     * 根据指定策略返回实际的收费值
     * @param money
     * @return
     */
    @Override
    public double cash(double money) {
        return money * rebate / 10;
    }

    @Override
    public String toString() {
        return rebate + "折";
    }
}
