package com.xworkz.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.project.entity.MessageEntity;

public interface MessageRepository extends JpaRepository<MessageEntity, Integer> {

}
