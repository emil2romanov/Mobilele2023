package com.softuni.mobilele.model.dto;

import com.softuni.mobilele.model.enums.EngineEnum;
import com.softuni.mobilele.model.enums.TransmissionEnum;

import java.math.BigDecimal;

public record OfferSummaryDTO (
        String brand,
        String model,
        int year,
        int mileage,
        BigDecimal price,
        EngineEnum engine,
        TransmissionEnum transmission
) {
    String summary() {
        return brand + " " + model + ", " + year;
    }
}
