package cn.jfliu.service.impl;

import cn.jfliu.dao.UserDao;
import cn.jfliu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
//
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    public UserServiceImpl() {
//    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void save() {
//        容器获取
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao =(UserDao) app.getBean("userDao");
//        userDao.save();
        userDao.save();
    }
}
