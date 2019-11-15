package com.example.design.openclose;

import lombok.AllArgsConstructor;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/11/12
 */
@AllArgsConstructor
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private Double price;


    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
