package com.softuni.mobilele.service;

import com.softuni.mobilele.model.dto.CreateOfferDTO;
import com.softuni.mobilele.model.dto.OfferSummaryDTO;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDTO createOfferDTO);

    Page<OfferSummaryDTO>
}
