package com.example.demo.user.service;

import com.example.demo.user.dto.UserPatchDto;
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
        }//중복확인
        userRepository.save(User.builder()
                .id(userSaveDto.getId())
                .pw(userSaveDto.getPw())
                .email(userSaveDto.getEmail())
                .name(userSaveDto.getName())
                .build());
    }

    public void updateUser(String id, UserPatchDto userPatchDto){
        User user=existUser(id);//id 확인
        UserStatus(user);//삭제여부확인
        user.update(userPatchDto.getPw(),
                userPatchDto.getEmail(),
                userPatchDto.getName());
    }

    public void deleteUser(String id){//실제 삭제가 아닌 논리적으로 삭제
        User user=existUser(id);
        UserStatus(user);
        user.changeUse(false);
    }
    private static void UserStatus(User user){
        if(!user.isUserUse()) throw new BusinessExceptionHandler((ErrorCode.SAME_ID));//아이디 삭제
    }

    public User existUser(String userId) {
        Optional<User> op = userRepository.findById(userId);
        User user = op.orElseThrow(() -> new BusinessExceptionHandler(ErrorCode.ID_NOT_FOUND));
        return user;
    }
    protected boolean existId (String id) {
        Optional<User> op = userRepository.findById(id);
        if(op.isEmpty()){
            return false;
        }
        return true;
    }



}
