package com.hhx.design.pattern.bridge.color;

import com.hhx.design.pattern.bridge.Color;

/**
 * 红色
 *
 * @author hhx
 */
public class Red implements Color {

    @Override
    public String getColor() {
        return "红色";
    }
}
