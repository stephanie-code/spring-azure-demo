package com.javatechie.azure.demo.service;

import com.javatechie.azure.demo.model.Answer;
import com.javatechie.azure.demo.model.QuestionAnswer;
import com.javatechie.azure.demo.model.Questionnaire;
import com.javatechie.azure.demo.model.Forms;
import com.javatechie.azure.demo.repository.AnswerRepositary;
import com.javatechie.azure.demo.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionAnswerService {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;
    @Autowired
    private AnswerRepositary answerRepositary;

    public Forms fetchQuestionAnswerList() {
        List<Questionnaire> questionnaires =
                questionnaireRepository.findAll();
        List<Answer> answers =
                answerRepositary.findAll();
        Forms formsList = new Forms();
        List<QuestionAnswer> questionAnswerList = new ArrayList<>();

        for (final Questionnaire question : questionnaires) {
            QuestionAnswer questionAnswer = new QuestionAnswer();
            questionAnswer.QuestionName = question.getQuestion();
            questionAnswer.QuesKey = question.getQueskey();

            List<String> answerslist = new ArrayList<>();
            for (final Answer answer : answers) {
                if (answer.getId() == question.getId()) {
                    answerslist.add(answer.getOptions());
                }
            }
            questionAnswer.Answer = answerslist;
            questionAnswerList.add(questionAnswer);
        }
        formsList.questionAnswerList = questionAnswerList;
        return formsList;
    }
}
