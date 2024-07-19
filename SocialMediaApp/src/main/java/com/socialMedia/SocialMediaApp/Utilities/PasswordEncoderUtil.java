package com.socialMedia.SocialMediaApp.Utilities;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderUtil {
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public PasswordEncoderUtil() {
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public String encodePassword(String rawPassword) {
        return bCryptPasswordEncoder.encode(rawPassword);
    }

    public boolean matchPassword(String rawPassword, String encodedPassword) {
        return bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
    }
}
