package com.opeleh.apigateway.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class AuthUserDetailsServices implements UserDetailsService {
    private final String password = "ava";
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    private String hashedPassword = passwordEncoder.encode(password);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("ava", hashedPassword, new ArrayList<>());      
    }

}