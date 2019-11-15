package com.example.design.openclose;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/11/12
 */
public class JavaDiscountPrice extends JavaCourse {

    public JavaDiscountPrice(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
