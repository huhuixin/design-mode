package com.hhx.design.strategy.store;

import com.hhx.design.strategy.store.strategy.NormalStrategy;
import com.hhx.design.strategy.store.strategy.RebateStrategy;
import com.hhx.design.strategy.store.strategy.ReturnStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 策略上下文
 *
 * @author hhx
 */
public class CashContext {

    private CashStrategy cashStrategy;

    /**
     * 不可变List
     */
    public static final List<CashStrategy> CASH_STRATEGIES = Collections.unmodifiableList(
            Arrays.asList(new NormalStrategy(),
            new RebateStrategy(3),
            new RebateStrategy(5),
            new ReturnStrategy(500, 80),
            new ReturnStrategy(200, 30)
    ));

    public CashContext(CashStrategy cashStrategy){
        if(!CASH_STRATEGIES.contains(cashStrategy)){
            throw new IllegalArgumentException("不合法的营销策略!");
        }
        this.cashStrategy = cashStrategy;
    }

    public CashContext(String strategy){
        this.cashStrategy = CASH_STRATEGIES.stream()
                .filter(st -> st.toString().equals(strategy))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("不合法的营销策略!"));
    }

    public double getResult(double money){
        return cashStrategy.cash(money);
    }
}
