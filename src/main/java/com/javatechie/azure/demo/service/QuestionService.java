package com.javatechie.azure.demo.service;

import com.javatechie.azure.demo.model.Questionnaire;
import com.javatechie.azure.demo.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    private EntityManager em;

    // Read operation
    public List<Questionnaire> fetchQuestionList()
    {
        return (List<Questionnaire>)
                questionnaireRepository.findAll();
    }

    public List<Questionnaire> getQuesandOptions() {
        return em.createNamedStoredProcedureQuery("getQueOption").getResultList();
    }


}
