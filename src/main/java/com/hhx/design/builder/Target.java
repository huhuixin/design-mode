package com.hhx.design.builder;

import lombok.Data;
import lombok.ToString;

/**
 * 需要构建的对象
 *
 * @author hhx
 */
@Data
@ToString
public class Target {
    private Integer paramA;
    private String paramB;

    private Target(){
    }

    private Target(Integer paramA, String paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public static class BuilderA implements Builder<Target>{

        private Integer paramA;

        public BuilderA(Integer paramA) {
            this.paramA = paramA;
        }

        @Override
        public Target build() {
            return new Target(paramA, "");
        }
    }

    public static class BuilderB implements Builder<Target>{

        private String paramB;

        public BuilderB(String paramB) {
            this.paramB = paramB;
        }

        @Override
        public Target build() {
            return new Target(0, paramB);
        }
    }
}
