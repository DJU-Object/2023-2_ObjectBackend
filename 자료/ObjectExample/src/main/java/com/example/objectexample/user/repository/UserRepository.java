package com.example.objectexample.user.repository;


import com.example.objectexample.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
