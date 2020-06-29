package com.jjd.design.pattern.visitor;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class Client {

    public static void main(String[] args) {
        Person man = new Man();
        Person woan = new Woman();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(man);
        objectStructure.attach(woan);

        Action success = new Success();
        objectStructure.display(success);

        Action fail = new Fail();
        objectStructure.display(fail);

        Action wait = new Wait();
        objectStructure.display(wait);
    }
}
