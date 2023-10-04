package com.softuni.mobilele.model.dto;

import com.softuni.mobilele.model.enums.EngineEnum;
import com.softuni.mobilele.model.enums.TransmissionEnum;

public record CreateOfferDTO (String description,
                              Long modelId,
                              EngineEnum engine,
                              TransmissionEnum transmission,
                              String imageUrl,
                              Integer mileage,
                              Integer price,
                              Integer year) {
}
