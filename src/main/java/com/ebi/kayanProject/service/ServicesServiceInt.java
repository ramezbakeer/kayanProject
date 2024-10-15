package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.UserPrinciple;
import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.model.UserDto;

import java.util.List;

public interface ServicesServiceInt {
    public void applyToService(Long serviceId, UserPrinciple user);
public List<ServicesDto> getAllServices();
}
