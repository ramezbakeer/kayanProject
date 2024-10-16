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
            userDto.setPassword(encoder.encode(userDto.getPassword()));
            return modelMapper.map((userInt.save(modelMapper.map(userDto, UserEntity.class))), UserDto.class);

    }

    public LoginUserDto getLoginUserDto(UserEntity userEntity) {
        LoginUserDto loginUserDto = new LoginUserDto();
        loginUserDto.setFName(userEntity.getFName());
        loginUserDto.setPassword(userEntity.getPassword());
        return loginUserDto;
    }

}
