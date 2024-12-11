package com.My_spring.My_spring.Repository;

import com.My_spring.My_spring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

}
