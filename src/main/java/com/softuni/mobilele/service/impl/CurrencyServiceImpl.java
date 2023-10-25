package com.softuni.mobilele.service.impl;

import com.softuni.mobilele.model.dto.ExchangeRatesDTO;
import com.softuni.mobilele.service.CurrencyService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public void refreshRates(ExchangeRatesDTO exchangeRatesDTO) {
        BigDecimal BGN_TO_USD = getExchangeRate(exchangeRatesDTO, "BGN", "USD").orElse(null);
        BigDecimal BGN_TO_EUR = getExchangeRate(exchangeRatesDTO, "BGN", "EUR").orElse(null);
    }

    private static Optional<BigDecimal> getExchangeRate(ExchangeRatesDTO exchangeRatesDTO, String from, String to) {

    }
}
