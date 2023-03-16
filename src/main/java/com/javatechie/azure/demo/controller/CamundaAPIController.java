package com.javatechie.azure.demo.controller;

import com.javatechie.azure.demo.model.StartProcess;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/camundaController")
public class CamundaAPIController {
    @PostMapping("start")
    public Object startProcess(@RequestBody StartProcess startProcess){
        try{
            HttpHeaders headers = new HttpHeaders();
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<StartProcess> httpEntity = new HttpEntity<>(startProcess, headers);

            headers.add(HttpHeaders.CONTENT_TYPE, "application/json");
            String url = "https://investwebapp.azurewebsites.net/engine-rest/process-definition/key/investment_app_process/start";

            ResponseEntity<Object> result =  restTemplate.postForEntity(url, httpEntity,Object.class);
            Object res = result.getBody();
            return res;
        } catch (Exception exception){
            throw exception;
        }
    }
}
