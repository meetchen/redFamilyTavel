package top.xust17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.xust17.domain.User;
import top.xust17.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public String findAll(){
        return "list";
    }
    @RequestMapping("/loginByName")
    public @ResponseBody User findByUserName(@RequestBody User user){
        return userService.findByUserName(user);
    }

    @RequestMapping("/signUp")
    public @ResponseBody User saveUser(@RequestBody User user){
        userService.saveUser(user);
        // 此处傻B代码 emmm
        User byUserName = userService.findByUserName(user);
        return byUserName;
    }
}
