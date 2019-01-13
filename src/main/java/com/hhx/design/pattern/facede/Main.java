package com.hhx.design.pattern.facede;

import com.hhx.design.pattern.facede.system.CPU;
import com.hhx.design.pattern.facede.system.Disk;
import com.hhx.design.pattern.facede.system.Memory;

/**
 * test
 *
 * @author hhx
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new CPU(), new Disk(), new Memory());
        // 把一些复杂的流程封装成一个接口供给外部用户更简单的使用
        computer.start();
        System.out.println(" do sth ....");
        computer.shutdown();
    }
}
