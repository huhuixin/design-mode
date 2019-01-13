package com.hhx.design.pattern.store.strategy;

import com.hhx.design.pattern.store.CashStrategy;

/**
 * 满减
 *
 * @author hhx
 */
public class ReturnStrategy implements CashStrategy {

    private double conditionMoney;
    private double returnMoney;

    public ReturnStrategy(double conditionMoney, double returnMoney) {
        if(returnMoney > conditionMoney){
            throw new IllegalArgumentException("返利不能大于条件!");
        }
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    /**
     * 根据指定策略返回实际的收费值
     * @param money
     * @return
     */
    @Override
    public double cash(double money) {
        if(money >= conditionMoney){
            return money - returnMoney;
        }
        return money;
    }

    @Override
    public String toString() {
        return "满" + conditionMoney + "减" + returnMoney;
    }
}
