package com.jjd.design.pattern.bridge;

/**
 * @author jjd
 * @date 2020-05-28
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new HuaWeiPhone());
        foldedPhone.cell();
        foldedPhone.open();
        foldedPhone.close();
    }
}
