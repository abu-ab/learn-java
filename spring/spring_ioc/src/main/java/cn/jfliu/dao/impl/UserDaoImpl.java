package cn.jfliu.dao.impl;

import cn.jfliu.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public UserDaoImpl() {
//        System.out.println("UserDaoImpl create");
//    }
//    public void init(){
//        System.out.println("init");
//    }
//
//    public void destory(){
//        System.out.println("destory");
//    }
//
    public void save() {
        System.out.println(name+"===="+age);
        System.out.println("running");
    }
}
