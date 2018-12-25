package com.hhx.design.bridge.shape;

import com.hhx.design.bridge.Color;
import com.hhx.design.bridge.Shape;

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
