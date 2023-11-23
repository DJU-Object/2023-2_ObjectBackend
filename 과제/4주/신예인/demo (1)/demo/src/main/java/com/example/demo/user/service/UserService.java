package com.example.demo.user.service;

import com.example.demo.user.dto.UserSavedto;
import com.example.demo.user.entity.User;
import com.example.demo.user.exception.BusinessExceptionHandler;
import com.example.demo.user.exception.ErrorCode;
import com.example.demo.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;


    public void saveUser(UserSavedto userSaveDto){
        if(existId((userSaveDto.getId()))){
            throw new BusinessExceptionHandler(ErrorCode.SAME_ID);
        }
        userRepository.save(User.builder()
                .id(userSaveDto.getId())
                .pw(userSaveDto.getPw())
                .email(userSaveDto.getEmail())
                .name(userSaveDto.getName())
                .build());
    }
    protected boolean existId(String id){
        Optional<User> op=userRepository.findById(id);
        if(op.isEmpty()){
            return false;
        }
        return true;
    }

}
