package cn.jfliu.factory;

import cn.jfliu.dao.UserDao;
import cn.jfliu.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
