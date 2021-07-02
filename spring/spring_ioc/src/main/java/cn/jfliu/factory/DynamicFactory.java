package cn.jfliu.factory;

import cn.jfliu.dao.UserDao;
import cn.jfliu.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
