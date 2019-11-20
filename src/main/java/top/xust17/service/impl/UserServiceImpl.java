package top.xust17.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xust17.dao.UserDao;
import top.xust17.domain.User;
import top.xust17.service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        System.out.println("业务层：查询所有用户");
        return userDao.findAll();
    }

    public void saveUser(User user) {
        System.out.println("业务层：保存所有账户");
    }
}
