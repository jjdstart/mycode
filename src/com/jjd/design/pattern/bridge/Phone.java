package com.jjd.design.pattern.bridge;

/**
 * @author jjd
 * @date 2020-05-28
 */
public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }

    public void cell() {
        this.brand.open();
    }

    public void close() {
        this.brand.close();
    }
}
