package com.jjd.design.pattern.proxy.staticproxy;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class TeacherProxy implements ITeacher {

    Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void terch() {
        System.out.println("上课前");
        teacher.terch();
        System.out.println("上课后");
    }
}
