package com.example.design.dependenceinversion;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/11/12
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.err.println("wy 学习前端");
    }
}
