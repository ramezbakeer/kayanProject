package com.ebi.kayanProject.repo;

import com.ebi.kayanProject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepoInt extends JpaRepository<UserEntity, Long> {
    @Query("from UserEntity e where e.fName = :firstName")
    public UserEntity findByFName(String firstName);
}

