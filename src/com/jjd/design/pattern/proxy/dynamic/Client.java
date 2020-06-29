package com.jjd.design.pattern.proxy.dynamic;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class Client {

    public static void main(String[] args) {
        ITeacher teacher = new Teacher();

        ProxyFactory proxyFactory = new ProxyFactory(teacher);

        ITeacher proxyInstance = (ITeacher) proxyFactory.getProxyInstance();

        proxyInstance.teach();
    }
}
