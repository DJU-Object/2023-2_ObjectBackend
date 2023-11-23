package com.example.demo.user.dto;

import com.example.demo.user.entity.User;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserSavedto {
    private String id;
    private String pw;
    private String email;
    private String name;

    @Builder
    public UserSavedto(String id,String pw,String email,String name){
        this.id=id;
        this.pw=pw;
        this.email=email;
        this.name=name;

    }
    public User toentity(){
        return User.builder()
                .id(id)
                .pw(pw)
                .email(email)
                .name(name)
                .build();


    }



}
