package com.hhx.design.strategy.store;

/**
 * 策略模式实现商户
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        for (CashStrategy strategy : CashContext.CASH_STRATEGIES) {
            CashContext cashContext = new CashContext(strategy);
            System.out.println(cashContext.getResult(100));
        }
    }
}
