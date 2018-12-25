package com.hhx.design.strategy.store;

/**
 * 收费策略
 *
 * @author hhx
 */
public interface CashStrategy {

    /**
     * 根据指定策略返回实际的收费值
     * @param money
     * @return
     */
    double cash(double money);
}
