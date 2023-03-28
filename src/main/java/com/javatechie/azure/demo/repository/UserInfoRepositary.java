package com.javatechie.azure.demo.repository;

import com.javatechie.azure.demo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepositary extends JpaRepository<UserInfo, Integer> {
}
