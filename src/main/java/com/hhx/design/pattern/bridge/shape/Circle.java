package com.hhx.design.pattern.bridge.shape;

import com.hhx.design.pattern.bridge.Color;
import com.hhx.design.pattern.bridge.Shape;

/**
 * 圆形
 *
 * @author hhx
 */
public class Circle extends Shape {

    private Integer radius;

    public Circle(Color color, Integer radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getShape() {
        return "半径为" + radius + "的圆形";
    }
}
