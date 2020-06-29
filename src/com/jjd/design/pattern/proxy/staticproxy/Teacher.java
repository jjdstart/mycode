package com.jjd.design.pattern.proxy.staticproxy;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class Teacher implements ITeacher{

    @Override
    public void terch() {
        System.out.println("cc 上课中");
    }
}
