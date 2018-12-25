package com.hhx.design.proxy.example1;

/**
 * 秘书
 *
 * @author hhx
 */
public class Secretary implements BossInterface {

    private Boss boss;

    public Secretary(Boss boss){
        this.boss = boss;
    }

    /**
     * 开会
     */
    @Override
    public void meeting() {
        boss.meeting();
    }
}
