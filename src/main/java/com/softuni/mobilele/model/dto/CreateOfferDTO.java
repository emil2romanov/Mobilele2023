package com.softuni.mobilele.model.dto;

import com.softuni.mobilele.model.enums.EngineEnum;
import com.softuni.mobilele.model.enums.TransmissionEnum;
import jakarta.validation.constraints.*;

public record CreateOfferDTO (
        @NotEmpty
        @Size(min = 5, max = 512)
        String description,
        @Positive
        @NotNull
        Long modelId,
        @NotNull
        EngineEnum engine,
        @NotNull
        TransmissionEnum transmission,
        @NotEmpty
        String imageUrl,
        @Positive
        @NotNull
        Integer mileage,
        @Positive
        @NotNull
        Integer price,
        @NotNull
        @Min(1930)
        Integer year) {
    public CreateOfferDTO () {
        this(null, null, null, null, null, null, null, null);
    }
}
