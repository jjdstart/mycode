package com.jjd.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class Client {

    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>(10);
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
