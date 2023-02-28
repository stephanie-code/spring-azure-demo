package com.javatechie.azure.demo.service;

import com.javatechie.azure.demo.model.Questionnaire;
import com.javatechie.azure.demo.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Service
public class QuestionnaireService {
    @Autowired
    private QuestionnaireRepository userRepository;
    @PersistenceContext
    private EntityManager em;
    public List<Questionnaire> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(Questionnaire user) {
        userRepository.save(user);
    }

    public Questionnaire getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public List getAllEmployees() {
        return em.createNamedStoredProcedureQuery("getquiz").getResultList();
//        List<Questionnaire> result = em.createNamedStoredProcedureQuery("getQueOption").getResultList();
//        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("getQueOption",Questionnaire);
//        storedProcedure.execute();
//        String question = (String) storedProcedure.getOutputParameterValue(2);
//
//        return question;

    }

    public List getAllPersons() {
//        Object obj = em.createNamedStoredProcedureQuery("GET_JOINED_RESULT").getResultList();
        return em.createNamedStoredProcedureQuery("GET_JOINED_RESULT").getResultList();
    }

}