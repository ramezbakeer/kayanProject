package com.ebi.kayanProject.repo;

import com.ebi.kayanProject.entity.ServicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepoInt extends JpaRepository<ServicesEntity,Long> {
}
