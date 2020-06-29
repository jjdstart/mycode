package com.jjd.design.pattern.proxy.dynamic;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class Teacher implements ITeacher{

    @Override
    public void teach() {
        System.out.println("上课ing");
    }
}
