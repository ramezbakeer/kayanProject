package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.UserEntity;
import com.ebi.kayanProject.entity.UserPrinciple;
import com.ebi.kayanProject.repo.UserRepoInt;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements MyUserDetailsServiceInt{
    private final UserRepoInt userRepo;
    public MyUserDetailsService(UserRepoInt userRepo) {
        this.userRepo = userRepo;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepo.findByFName(username);
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }
        return new UserPrinciple(user);
    }
}
