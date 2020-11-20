package com.jjd.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jjd
 * @date 2020-11-18
 */
public class LockTest {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread a = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("a come in");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "a");


        Thread b = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("b come in");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "b");


        Thread c = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("c come in");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "b");


        a.start();
        b.start();
        c.start();


    }
}
