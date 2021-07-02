package cn.jfliu.dao.impl;

import cn.jfliu.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="cn.jfliu.dao.impl.UserDaoImpl"></bean>
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("save");
    }
}
