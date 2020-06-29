package com.jjd.design.pattern.flyweight;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class ConcreteWebSite extends WebSite {

    //共享的部分，内部状态
    private String type;

    //构造器
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
