package com.xworkz.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.springboot.entity.AppInfoEntity;
import com.xworkz.springboot.entity.EnvironmentEntity;

@Repository
public interface AppInfoRepository extends JpaRepository<AppInfoEntity, Integer> {

	public String save(AppInfoEntity appInfoEntity1, List<EnvironmentEntity> envEntitySList);

}
