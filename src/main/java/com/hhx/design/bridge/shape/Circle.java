package com.hhx.design.bridge.shape;

import com.hhx.design.bridge.Color;
import com.hhx.design.bridge.Shape;

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
