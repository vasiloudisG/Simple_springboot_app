package com.My_spring.My_spring.Service;

import com.My_spring.My_spring.Entity.User;
import com.My_spring.My_spring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User saveDetails(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUserById(int id) {
        userRepo.deleteById(id);
    }

}
