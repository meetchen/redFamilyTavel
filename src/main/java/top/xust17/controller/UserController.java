package top.xust17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.xust17.domain.User;
import top.xust17.service.UserService;



@Controller
@CrossOrigin
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
        System.out.println("哈哈哈哈哈");
        userService.saveUser(user);
        // 此处傻B代码 emmm
        User byUserName = userService.findByUserName(user);
        return byUserName;
    }

    @RequestMapping("/test")
    public @ResponseBody User test(String name) {
        User user = new User();
        user.setUserName(name);
        return userService.findByUserName(user);
    }
}
