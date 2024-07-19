package com.socialMedia.SocialMediaApp.services;

import com.socialMedia.SocialMediaApp.Repository.UserRepository;
import com.socialMedia.SocialMediaApp.Utilities.PasswordEncoderUtil;
import com.socialMedia.SocialMediaApp.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServices{

    @Autowired
    private PasswordEncoderUtil passwordEncoderUtil;

    @Autowired
    private UserRepository userRepository;

    public UserModel createNewUser(UserModel newUser){
        newUser.setPassword(passwordEncoderUtil.encodePassword(newUser.getPassword()));
        System.out.println("Encoded Password for "+newUser.getUsername()+" = "+newUser.getPassword());
        return userRepository.save(newUser);
    }

    public UserModel authenticateUser(String email,String password){
        UserModel gotUser = userRepository.findByEmail(email);
        boolean authenticated = passwordEncoderUtil.matchPassword(gotUser.getPassword(),email);
        if(authenticated){
            return gotUser;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid Password");
    }

}