package com.My_spring.My_spring.Controller;

import com.My_spring.My_spring.Entity.User;
import com.My_spring.My_spring.Repository.UserRepository;
import com.My_spring.My_spring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public User postDetails(@RequestBody User user){
        System.out.println("Received User: " + user.getName());
        return userService.saveDetails(user);
    }
    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}
