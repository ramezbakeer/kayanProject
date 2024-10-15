package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.ServicesEntity;
import com.ebi.kayanProject.entity.UserEntity;
import com.ebi.kayanProject.entity.UserPrinciple;
import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.repo.ServicesRepoInt;
import com.ebi.kayanProject.repo.UserRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicesService implements ServicesServiceInt {
    private final ServicesRepoInt servicesRepoInt;
    private final ModelMapper modelMapper=new ModelMapper();
    private final UserRepoInt userRepoInt;

    public ServicesService(ServicesRepoInt servicesRepoInt, UserRepoInt userRepoInt) {
        this.servicesRepoInt=servicesRepoInt;
        this.userRepoInt = userRepoInt;
    }

    @Override
    public void applyToService(Long serviceId, UserPrinciple userPrinciple) {
        ServicesEntity servicesEntity=servicesRepoInt.findById(serviceId).orElseThrow();
        ServicesDto servicesDto=modelMapper.map(servicesEntity, ServicesDto.class);
        UserDto user = modelMapper.map(userRepoInt.findByFName(userPrinciple.getUsername()),UserDto.class);
        user.getServices().add(servicesDto);
        servicesDto.getUsers().add(user);
        userRepoInt.save(modelMapper.map(user, UserEntity.class));
        servicesRepoInt.save(servicesEntity);
    }

    @Override
    public List<ServicesDto> getAllServices() {
        List<ServicesEntity> servicesEntities =servicesRepoInt.findAll();
        return servicesEntities.stream().map(servicesRepoInt1 -> modelMapper.map(servicesRepoInt1,ServicesDto.class)).collect(Collectors.toList());
    }
}
