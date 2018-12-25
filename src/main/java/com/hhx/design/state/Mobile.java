package com.hhx.design.state;

/**
 * 手机
 *
 * @author hhx
 */
public class Mobile {

    private String tel;

    private double money;

    private State state;

    public Mobile(String tel, double money) {
        this.tel = tel;
        this.money = money;
        state = money >= 0 ? MobileStateEnums.NORMAL : MobileStateEnums.DOWN;
    }

    public void call(String number){
        state.handle(this);
        System.out.println("call: " + number);
        money -= 0.1;
        System.out.println(String.format("当前余额: %.2f" , money));
        if(money <= 0){
            state = MobileStateEnums.DOWN;
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
