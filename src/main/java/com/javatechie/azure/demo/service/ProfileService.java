package com.javatechie.azure.demo.service;

import com.javatechie.azure.demo.model.*;
import com.javatechie.azure.demo.repository.ProfileRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfileService {

    @Autowired
    private ProfileRepositary profileRepositary;

    public String submitNewProfile(Profile profile) {
        try{
            profileRepositary.save(profile);
            return "Data Inserted";
        } catch (Exception exception){
            throw exception;
        }

    }
}
