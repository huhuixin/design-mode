package com.hhx.design.pattern.memento;

/**
 * 备忘的对象
 *
 * @author hhx
 */
public class Target implements MementoAble {

    private Integer state;

    public Target(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Target{" +
                "state=" + state +
                '}';
    }
}
