package com.javatechie.azure.demo.repository;

import com.javatechie.azure.demo.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepositary extends JpaRepository<Answer, Integer> {
}
