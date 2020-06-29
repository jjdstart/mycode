package com.jjd.design.pattern.builder;

/**
 * @author jjd
 * @date 2020-05-28
 */
public class Client {
    HouseDirector houseDirector;

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
    }
}