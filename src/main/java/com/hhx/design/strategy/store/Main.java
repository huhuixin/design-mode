package com.hhx.design.strategy.store;

import com.hhx.utils.InputUtil;
import com.hhx.utils.SupplierUtil;

/**
 * 策略模式实现商户
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        SupplierUtil.forever(() -> {
            // 输入价格
            String money = InputUtil.enterNumber("消费金额");
            // 选择策略
            CashContext cashContext = new CashContext(InputUtil.choose("营销策略", CashContext.CASH_STRATEGIES));
            // 获取结果
            System.out.println(cashContext.getResult(Double.valueOf(money)));
            return null;
        });
    }
}
