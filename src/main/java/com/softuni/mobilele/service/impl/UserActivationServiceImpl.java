package com.softuni.mobilele.service.impl;

import com.softuni.mobilele.model.events.UserRegisteredEvent;
import com.softuni.mobilele.service.UserActivationService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserActivationServiceImpl implements UserActivationService {

    @Override
    @EventListener(UserRegisteredEvent.class)
    public void userRegistered(UserRegisteredEvent event) {
        // TODO: ADD Activation links
        System.out.println("User with email " + event.getUserEmail());
    }
}
