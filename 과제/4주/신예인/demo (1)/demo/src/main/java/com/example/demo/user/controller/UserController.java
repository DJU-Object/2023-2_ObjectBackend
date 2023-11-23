package com.example.demo.user.controller;

import com.example.demo.user.dto.UserSavedto;
import com.example.demo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    public final UserService userService;

    @PostMapping
    public ResponseEntity save(@RequestBody UserSavedto userSavedto){
        userService.saveUser(userSavedto);
        return ResponseEntity.created(URI.create("/user")).build();
    }

}

