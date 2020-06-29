package com.jjd.design.pattern.bridge;

/**
 * @author jjd
 * @date 2020-05-28
 */
public class HuaWeiPhone implements Brand{

    @Override
    public void open() {
        System.out.println("huawei phone open");
    }

    @Override
    public void cell() {
        System.out.println("huawei phone cell ing");
    }

    @Override
    public void close() {
        System.out.println("huawei phone close");
    }
}
