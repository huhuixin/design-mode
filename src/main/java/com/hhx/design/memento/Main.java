package com.hhx.design.memento;

/**
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        CareTaker<Target> careTaker = new CareTaker<>();
        // 创建备份目标
        Target target = new Target(0);
        System.out.println("初始状态: " + target.getState());
        // 保存进度
        careTaker.add(new TargetMemento(target.getState()));
        // 修改状态
        target.setState(1);
        System.out.println("修改后的状态: " + target.getState());

        target = careTaker.get(0);
        System.out.println("读取进度后的状态: " + target.getState());
    }
}
