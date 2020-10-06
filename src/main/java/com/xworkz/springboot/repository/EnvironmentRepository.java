package com.xworkz.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.springboot.entity.EnvironmentEntity;

@Repository
public interface EnvironmentRepository extends JpaRepository<EnvironmentEntity, Integer> {

}
