package com.javatechie.azure.demo.repository;
import com.javatechie.azure.demo.model.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Integer> {
}