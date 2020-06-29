package com.jjd.design.pattern.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 原型设计模式-深拷贝
 *
 * @author jjd
 * @date 2020-05-27
 */
public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    public String name; //String 属 性
    public Date date;// 引用类型

    public DeepProtoType() {
        super();
    }

    //深克隆实现方式1
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型(属性)和 String 的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deep1 = (DeepProtoType) deep;
        deep1.date = (Date) deep1.date.clone();
        return deep1;
    }

    //深克隆实现方式2
    public Object deepClone() {
        //创建对象流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try(ByteArrayOutputStream boss = new ByteArrayOutputStream();) {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);//当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return (DeepProtoType) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
