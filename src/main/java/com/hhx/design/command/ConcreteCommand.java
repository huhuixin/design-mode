package com.hhx.design.command;

/**
 * 命令
 *
 * @author hhx
 */
public class ConcreteCommand implements Command{

    /**
     * 接受命令的对象
     */
    protected Receiver receiver;


    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        System.out.println("ConcreteCommand execute .. ");
        receiver.action();
    }
}
