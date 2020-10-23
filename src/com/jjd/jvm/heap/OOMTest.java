package com.jjd.jvm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author jjd
 * @date 2020-10-22
 */
public class OOMTest {
    public static void main(String[] args) throws InterruptedException {
        List<Picture> list = new ArrayList<>();
        while (true) {
            Thread.sleep(20);
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture {
    public byte[] bytes;

    public Picture(int size) {
        this.bytes = new byte[size];
    }
}
