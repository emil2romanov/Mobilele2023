package com.softuni.mobilele.model.dto;

import com.softuni.mobilele.model.enums.EngineEnum;
import com.softuni.mobilele.model.enums.TransmissionEnum;

import java.math.BigDecimal;

public record OfferDetailDTO (
        String id,
        String brand,
        String model,
        int year,
        int mileage,
        BigDecimal price,
        EngineEnum engine,
        TransmissionEnum transmission,
        String imageUrl
) {
    public String summary() {
        return brand + " " + model + ", " + year;
    }
}

