package com.My_spring.My_spring.Controller;

import com.My_spring.My_spring.Entity.User;
import com.My_spring.My_spring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User postDetails(@RequestBody User user){
        System.out.println("Received User: " + user.getName());
        return userService.saveDetails(user);
    }
}
