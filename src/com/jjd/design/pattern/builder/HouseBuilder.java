package com.jjd.design.pattern.builder;

/**
 * 建造模式角色 - 抽象建造者
 * @author jjd
 * @date 2020-05-28
 */
public abstract class HouseBuilder {

    House house = new House();

    abstract void buildBasic();

    abstract void buildWalls();

    abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
