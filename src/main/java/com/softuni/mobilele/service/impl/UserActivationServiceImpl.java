package com.softuni.mobilele.service.impl;

import com.softuni.mobilele.model.events.UserRegisteredEvent;
import com.softuni.mobilele.service.EmailService;
import com.softuni.mobilele.service.UserActivationService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;

@Service
public class UserActivationServiceImpl implements UserActivationService {

    private static final String ACTIVATION_CODE_SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789";
    private static final int ACTIVATION_CODE_LENGTH = 20;
    private final EmailService emailService;

    public UserActivationServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    @EventListener(UserRegisteredEvent.class)
    public void userRegistered(UserRegisteredEvent event) {
        // TODO: ADD Activation links
        emailService.sendRegistrationEmail(event.getUserEmail(), event.getUserNames());
    }

    @Override
    public void cleanUpObsoleteActivationLinks() {
        //TODO: Implement
        System.out.println("NOT YET");
    }

    @Override
    public String createActivationCode(String userEmail) {

    }

    private static String generateActivationCode() {

        StringBuilder activationCode = new StringBuilder();
        Random random = new SecureRandom();

        for (int i = 0; i < ACTIVATION_CODE_LENGTH; i++) {
            int randInx = random.nextInt(ACTIVATION_CODE_SYMBOLS.length());
            activationCode.append(ACTIVATION_CODE_SYMBOLS.charAt(randInx));
        }

        return activationCode.toString();
    }
}
