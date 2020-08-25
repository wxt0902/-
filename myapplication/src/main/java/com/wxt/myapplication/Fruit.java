/**
 * 建立一个水果类的对象
 */
package com.wxt.myapplication;

public class Fruit {
    /*
    *水果的名称以及号
     */
    private  String name;
    private int ID;
    public String getName() {
        return name;
    }

    public Fruit(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
