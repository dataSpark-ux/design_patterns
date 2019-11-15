package com.example.design.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wy
 * @Description 开闭原则测试
 * 1 对扩展开放，对修改关闭
 * 如果要添加discountPrice，不应该修改其接口，以及基类,
 * 如果业务复杂的情况下可能会出现意想不到的结果，最简单的方法就是继承，重写的方式
 * @createTime 2019/11/12
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountPrice(946, "java课程", 34.9);
        JavaDiscountPrice course = (JavaDiscountPrice)iCourse;
        log.info("课程ID {},课程名称 {}, 课程价格 {}，折扣价格{}",course.getId(),course.getName(),course.getOriginPrice(),course.getPrice());
    }
}
