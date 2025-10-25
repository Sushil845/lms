package com.lms.util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHashGenerator {
    public static void main(String[] args) {
        String rawPassword = "admin123";
        String hashed = new BCryptPasswordEncoder().encode(rawPassword);
        System.out.println("BCrypt hash: " + hashed);
    }
}
