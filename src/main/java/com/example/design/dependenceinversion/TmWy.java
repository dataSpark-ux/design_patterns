package com.example.design.dependenceinversion;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/11/12
 */
public class TmWy {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }

}
