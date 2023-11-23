package com.example.demo.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserPatchDto {//UserUpdateDto

    private String pw;
    private String email;
    private String name;

    @Builder
    public UserPatchDto(String pw,String email,String name){
        this.pw=pw;
        this.email=email;
        this.name=name;
    }


}
