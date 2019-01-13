package com.hhx.design.pattern.flyweight;

/**
 * 用户
 *
 * @author hhx
 */
public class User implements CacheAble {
    private String cardId;

    public User(String cardId) {
        this.cardId = cardId;
        System.out.println("创建对象: " + cardId);
    }

    /**
     * 对象的特有ID
     * @return
     */
    @Override
    public String getId() {
        return cardId;
    }
}
