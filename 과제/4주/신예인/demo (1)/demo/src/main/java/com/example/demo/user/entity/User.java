package com.example.demo.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @Column(name="ID",nullable=false)
    private String id;

    @Column(name="PW",nullable=false)
    private String pw;

    @Column(name="EMAIL")
    private String email;

    @Column(name="NAME")
    private String name;

    @Column
    private boolean UserUse = true;
    @Builder
    public User(String id,String pw,String email,String name){
        this.id=id;
        this.pw=pw;
        this.email=email;
        this.name=name;

    }

    public void update(String pw,String email, String name){
        this.pw=pw;
        this.email=email;
        this.name=name;

    }

    public void changeUse(boolean Useruse){
        this.UserUse=Useruse;
    }




}
