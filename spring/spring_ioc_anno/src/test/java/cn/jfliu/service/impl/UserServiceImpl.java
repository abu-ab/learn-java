package cn.jfliu.service.impl;

import cn.jfliu.dao.UserDao;
import cn.jfliu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//<bean id="userService" class="cn.jfliu.service.impl.UserServiceImpl">

//</bean>
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {



    //<property name="userDao" ref="userDao"></property>
    @Autowired // 按照数据类型从spring容器中匹配
//    @Qualifier("userDao")
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        userDao.save();
    }
}
