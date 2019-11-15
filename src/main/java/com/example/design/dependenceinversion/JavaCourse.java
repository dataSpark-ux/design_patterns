package com.example.design.dependenceinversion;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/11/12
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.err.println("wy学习java");
    }
}
