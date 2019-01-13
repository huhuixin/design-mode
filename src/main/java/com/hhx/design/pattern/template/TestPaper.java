package com.hhx.design.pattern.template;

/**
 * 考试试卷
 * @author hhx
 */
public class TestPaper {

    private String q1;
    private String q2;

    public TestPaper(String q1, String q2) {
        this.q1 = q1;
        this.q2 = q2;
    }

    /**
     * 问题1
     */
    public void q1(){
        System.out.println(q1);
    }

    /**
     * 问题2
     */
    public void q2(){
        System.out.println(q2);
    }
}
