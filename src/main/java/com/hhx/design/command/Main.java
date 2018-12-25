package com.hhx.design.command;

/**
 * main
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        // Receiver 真正的命令执行对象
        // 先实例化一个 具体干活的对象
        Receiver receiver = new Receiver();
        // Command 具体的命令
        // 具体要做哪些工作,并且声明由谁来做
        Command command = new ConcreteCommand(receiver);
        // invoker 使用命令对象的入口
        // 下命令的人, 只需要下命令即可, 无需关心真正的操作执行者
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }

}
