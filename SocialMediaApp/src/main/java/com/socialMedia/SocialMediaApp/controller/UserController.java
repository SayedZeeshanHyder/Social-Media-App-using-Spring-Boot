package com.socialMedia.SocialMediaApp.controller;

import com.socialMedia.SocialMediaApp.models.UserModel;
import com.socialMedia.SocialMediaApp.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController{

    @Autowired
    private UserServices userServices;

    @PostMapping("/create")
    public UserModel createUser(@RequestBody UserModel newUser){
        return userServices.createNewUser(newUser);
    }

}