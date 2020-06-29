package com.jjd.design.pattern.bridge;

/**
 * @author jjd
 * @date 2020-05-28
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    public void cell() {
        super.cell();
        System.out.println("cell");
    }

    public void close() {
        super.close();
        System.out.println("close");
    }
}
