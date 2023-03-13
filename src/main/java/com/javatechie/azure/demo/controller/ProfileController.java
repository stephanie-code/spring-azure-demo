package com.javatechie.azure.demo.controller;

import com.javatechie.azure.demo.model.Profile;
import com.javatechie.azure.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @PostMapping("submitProfile")
    public String submitProfile(@RequestBody Profile profile) {
        return profileService.submitNewProfile(profile);
    }
}
