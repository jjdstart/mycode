package com.jjd.design.pattern.adapter.classadapter;

/**
 * @author jjd
 * @date 2020-05-28
 */
public class Phone {

    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("正常充电");
        } else if (voltage5V.output5V() > 5) {
            System.out.println("电压过大，不能充电");
        }
    }
}
