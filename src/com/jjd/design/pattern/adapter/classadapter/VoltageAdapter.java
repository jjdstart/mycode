package com.jjd.design.pattern.adapter.classadapter;

/**
 * 适配器类
 * @author jjd
 * @date 2020-05-28
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int output5V() {
        int strV = output220V();
        int desV = strV / 44;
        return desV;
    }
}
