package com.jjd.design.pattern.adapter.classadapter;

/**
 * 被适配角色
 * @author jjd
 * @date 2020-05-28
 */
public class Voltage220V {
    public int output220V() {
        System.out.println("220电压输出");
        return 220;
    }
}
