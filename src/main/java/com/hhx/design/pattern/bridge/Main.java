package com.hhx.design.pattern.bridge;


import com.hhx.design.pattern.bridge.color.Green;
import com.hhx.design.pattern.bridge.color.Red;
import com.hhx.design.pattern.bridge.shape.Circle;
import com.hhx.design.pattern.bridge.shape.Square;

/**
 * 桥接测试
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle(new Red(), 5);
        shape.show();
        shape = new Circle(new Green(), 5);
        shape.show();
        shape = new Square(new Red(), 5);
        shape.show();
        shape = new Square(new Green(), 5);
        shape.show();
    }
}
