package top.xust17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xust17.domain.User;
import top.xust17.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public String findAll(){
        System.out.println("表现层：查询所有账户");
        List<User> all = userService.findAll();
        System.out.println(all);
        return "list";
    }
}
