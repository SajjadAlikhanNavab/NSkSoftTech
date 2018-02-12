package com.nsksoft.demo.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nsksoft.demo.pojo.Organization;

@Configuration
public interface OrgnizationRepository extends JpaRepository<Organization, Integer> {

}
