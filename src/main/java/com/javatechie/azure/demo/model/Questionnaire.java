package com.javatechie.azure.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String queskey;
    private String question;

    public String getQueskey() {
        return queskey;
    }

    public void setQueskey(String queskey) {
        this.queskey = queskey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
