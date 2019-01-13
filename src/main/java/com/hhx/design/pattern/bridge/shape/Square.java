package com.hhx.design.pattern.bridge.shape;

import com.hhx.design.pattern.bridge.Color;
import com.hhx.design.pattern.bridge.Shape;

/**
 * 正方形
 *
 * @author hhx
 */
public class Square extends Shape {

    private Integer side;

    public Square(Color color, Integer side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getShape() {
        return "边长为"+side+"的正方形";
    }
}
