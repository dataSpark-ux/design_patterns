package com.example.design.dependenceinversion;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/11/12
 */
public class Test {


    public static void main(String[] args) {
        TmWy tmWy = new TmWy();
        tmWy.setiCourse(new JavaCourse());
        tmWy.studyCourse();
    }

    // v3
//    public static void main(String[] args) {
//        TmWy tmWy = new TmWy(new JavaCourse());
//        tmWy.studyCourse();
//    }
//    v2
//    public static void main(String[] args) {
//        TmWy tmWy = new TmWy();
//        tmWy.studyCourse(new JavaCourse());
//        tmWy.studyCourse(new FECourse());
//
//    }
//    V1
//    public static void main(String[] args) {
//        TmWy tmWy = new TmWy();
//        tmWy.studyFECourse();
//        tmWy.studyJavaCourse();
//    }


}
