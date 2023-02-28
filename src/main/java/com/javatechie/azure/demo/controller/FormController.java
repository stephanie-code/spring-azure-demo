package com.javatechie.azure.demo.controller;

import com.javatechie.azure.demo.model.Forms;
import com.javatechie.azure.demo.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class FormController {
    @Autowired
    QuestionAnswerService questionAnswerService;

    @GetMapping("getForm")
    public Forms getForm() {
        return questionAnswerService.fetchQuestionAnswerList();
    }
}
