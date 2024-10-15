package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.UserEntity;
import com.ebi.kayanProject.exception.CustomException;
import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.repo.UserRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService implements UserServiceInt {
    private final UserRepoInt userInt;
    private  final ModelMapper modelMapper =new ModelMapper();
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public UserService(UserRepoInt userInt) {
        this.userInt = userInt;

    }

    @Override
    public UserDto RegisterUser(UserDto userDto) {


//            if(userDto.getFName()==null || userDto.getFName()==""){
//                return null;
//            }
//            if(userDto.getLName()==null || userDto.getLName()==""){
//                return null;
//            }
//            if(userDto.getEmail()==null || userDto.getEmail()==""){
//                return null;
//            }
//            if(userDto.getPassword()==null || userDto.getPassword()==""){
//                return null;
//            }
//            if(userDto.getPhone()==null || userDto.getPhone()==""){
//                return null;
//            }
//            if(userDto.getAddress()==null || userDto.getAddress()==""){
//                return null;
//            }
//            if(userDto.getJobTitle()==null || userDto.getJobTitle()==""){
//                return null;
//            }
            userDto.setPassword(encoder.encode(userDto.getPassword()));
            return modelMapper.map((userInt.save(modelMapper.map(userDto, UserEntity.class))), UserDto.class);

    }

//    @Override
//    public LoginUserDto LoginUser(LoginUserDto loginUserDto) {
//        UserEntity userEntity = userInt.findByFName(loginUserDto.getFName());
//            if (userEntity != null && userEntity.getPassword().equals(loginUserDto.getPassword())) {
//                return modelMapper.map(userEntity, LoginUserDto.class);
//            } else {
//                throw new CustomException("Wrong password Or FName Invalid","/logIn");
//            }
//    }






//    public UserDto getUserDto(UserEntity userEntity) {
//        UserDto userDto = new UserDto();
//        userDto.setId(userEntity.getId());
//        userDto.setPhone(userEntity.getPhone());
//        userDto.setEmail(userEntity.getEmail());
//        userDto.setPassword(userEntity.getPassword());
//        userDto.setAddress(userEntity.getAddress());
//        userDto.setFName(userEntity.getFName());
//        userDto.setLName(userEntity.getLName());
//        userDto.setJobTitle(userEntity.getJobTitle());
//        return userDto;
//    }
//    public UserEntity getUserEntity(UserDto userDto) {
//        UserEntity userEntity = new UserEntity();
//        userEntity.setId(userDto.getId());
//        userEntity.setPhone(userDto.getPhone());
//        userEntity.setEmail(userDto.getEmail());
//        userEntity.setPassword(userDto.getPassword());
//        userEntity.setFName(userDto.getFName());
//        userEntity.setLName(userDto.getLName());
//        userEntity.setAddress(userDto.getAddress());
//        userEntity.setJobTitle(userDto.getJobTitle());
//        return userEntity;
//    }
    public LoginUserDto getLoginUserDto(UserEntity userEntity) {
        LoginUserDto loginUserDto = new LoginUserDto();
        loginUserDto.setFName(userEntity.getFName());
        loginUserDto.setPassword(userEntity.getPassword());
        return loginUserDto;
    }

}
