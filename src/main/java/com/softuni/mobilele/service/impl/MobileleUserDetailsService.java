package com.softuni.mobilele.service.impl;

import com.softuni.mobilele.model.entity.UserEntity;
import com.softuni.mobilele.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;


public class MobileleUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public MobileleUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository
                .findByEmail(email)
                .map(this::map)
                .orElseThrow(() -> new UsernameNotFoundException("User " + email + " not found!"));
    }

    private UserDetails map(UserEntity userEntity) {
        UserDetails userDetails = User
                .withUsername(userEntity.getEmail())
                .password(userEntity.getPassword())
                .authorities(List.of()) // TODO - add roles
                .build();

        return userDetails;
    }
}
