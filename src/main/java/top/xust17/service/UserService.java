package top.xust17.service;

import top.xust17.domain.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void saveUser(User user);
}
