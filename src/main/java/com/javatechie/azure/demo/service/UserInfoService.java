package com.javatechie.azure.demo.service;

import com.javatechie.azure.demo.model.UserInfo;
import com.javatechie.azure.demo.repository.UserInfoRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepositary userInfoRepositary;

    public String submitNewUser(UserInfo userInfo) {
        try{
            if(userInfo.getGender() == null || userInfo.getCity() == null || userInfo.getRootprocinstid() == null){
                return "Failed. Got a null response";
            } else {
                userInfoRepositary.save(userInfo);
                return "Data Inserted";
            }
        } catch (Exception exception){
            throw exception;
        }


    }
}
