package com.hhx.design.memento;

/**
 * 备忘录实例
 *
 * @author hhx
 */
public class TargetMemento implements IMemento<Target> {

    private Integer state;

    public TargetMemento(Integer state) {
        this.state = state;
    }

    @Override
    public Target get() {
        return new Target(this.state);
    }
}
