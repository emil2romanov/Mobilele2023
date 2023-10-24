package com.softuni.mobilele.service;

import com.softuni.mobilele.model.dto.ExchangeRatesDTO;

public interface CurrencyService {

    void refreshRates(ExchangeRatesDTO exchangeRatesDTO);
}
