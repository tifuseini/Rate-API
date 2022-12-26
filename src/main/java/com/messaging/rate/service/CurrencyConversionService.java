package com.messaging.rate.service;

import com.messaging.rate.models.CurrencyConversion;
import com.messaging.rate.repository.RateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyConversionService {

    private final RateRepository rateRepository;

    public CurrencyConversion convertFromTo(String base )
}
