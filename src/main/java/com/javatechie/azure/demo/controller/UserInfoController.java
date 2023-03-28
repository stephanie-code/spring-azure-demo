package com.javatechie.azure.demo.controller;

import com.javatechie.azure.demo.model.UserInfo;
import com.javatechie.azure.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @PostMapping("submitUserInfo")
    public String submitUserInformation(@RequestBody UserInfo userInfo) {
        return userInfoService.submitNewUser(userInfo);
    }
}
