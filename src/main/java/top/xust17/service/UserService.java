package top.xust17.service;

import top.xust17.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveUser(User user);

    User findByUserName(User user);

}