package com.hhx.design.builder;

/**
 * 需要构建的对象
 *
 * @author hhx
 */
public class Target {
    private Integer paramA;
    private String paramB;

    private Target(){
    }

    public Integer getParamA() {
        return paramA;
    }

    public void setParamA(Integer paramA) {
        this.paramA = paramA;
    }

    public String getParamB() {
        return paramB;
    }

    public void setParamB(String paramB) {
        this.paramB = paramB;
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
