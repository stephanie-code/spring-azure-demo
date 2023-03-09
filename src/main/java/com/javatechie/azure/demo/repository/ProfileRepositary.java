package com.javatechie.azure.demo.repository;

import com.javatechie.azure.demo.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepositary extends JpaRepository<Profile, Integer> {
}
