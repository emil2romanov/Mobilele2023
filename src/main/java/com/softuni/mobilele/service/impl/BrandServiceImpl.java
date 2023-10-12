package com.softuni.mobilele.service.impl;

import com.softuni.mobilele.model.dto.BrandDTO;
import com.softuni.mobilele.model.dto.ModelDTO;
import com.softuni.mobilele.model.entity.ModelEntity;
import com.softuni.mobilele.repository.BrandRepository;
import com.softuni.mobilele.repository.ModelRepository;
import com.softuni.mobilele.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    private final ModelRepository modelRepository;
    private final BrandRepository brandRepository;

    public BrandServiceImpl(ModelRepository modelRepository, BrandRepository brandRepository) {
        this.modelRepository = modelRepository;
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandDTO> getAllBrands() {

        return brandRepository.findAll().stream()
                .map(brand -> new BrandDTO(
                        brand.getBrand(),
                        modelRepository.findAllByBrandId(brand.getId()).stream()
                                .map(model -> new ModelDTO(model.getId(), model.getName()))
                                .sorted(Comparator.comparing(ModelDTO::name))
                                .collect(Collectors.toList())
                ))
                .sorted(Comparator.comparing(BrandDTO::name))
                .collect(Collectors.toList());
    }
}
