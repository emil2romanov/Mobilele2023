package com.softuni.mobilele.service;

import com.softuni.mobilele.model.events.UserRegisteredEvent;

public interface UserActivationService {

    void userRegistered(UserRegisteredEvent event);
}
