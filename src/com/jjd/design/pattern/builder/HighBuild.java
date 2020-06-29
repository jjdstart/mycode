package com.jjd.design.pattern.builder;

/**
 * 建造模式角色 - 具体建造者
 * @author jjd
 * @date 2020-05-28
 */
public class HighBuild extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("建高楼地基");
    }

    @Override
    void buildWalls() {
        System.out.println("建高楼墙");
    }

    @Override
    void roofed() {
        System.out.println("建高楼屋顶");
    }
}
