package com.example.demo.user.controller;

import com.example.demo.user.dto.UserPatchDto;
import com.example.demo.user.dto.UserSavedto;
import com.example.demo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PatchMapping("/{userId}")
    public ResponseEntity updateUser(@PathVariable String userId,@RequestBody UserPatchDto userPatchDto){
        userService.updateUser(userId,userPatchDto);
        return ResponseEntity.created(URI.create("/user")).build();
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteMenu(@PathVariable String userId){
        userService.deleteUser(userId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);


    }

}

