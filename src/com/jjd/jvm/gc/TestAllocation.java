package com.jjd.jvm.gc;

/**
 * @author jjd
 * @date 2020-06-29
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * -XX:PretenureSizeThreshold=3145728
 *
 */


public class TestAllocation {

    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        //testAllocation();
        //testPretenureSizeThreshold();
    }

    public static void testAllocation() {
        /*
        * 在总堆为20m，年轻代10m，老年代10m前提下
        * allocation4在分配内存会发成轻gc
        * 前面对象会直接移动到老年代
        */
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    /**
     * 设置当对象超过设置大小时 直接进入老年代
     */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }

    /**
     * 设置年轻代年龄限制，默认15
     */
    public static void testMaxTenuringThreshold() {

    }
}
