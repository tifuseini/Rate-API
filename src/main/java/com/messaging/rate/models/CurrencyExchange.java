package com.messaging.rate.models;

import lombok.Data;

@Data
public class CurrencyExchange {

    private static final String BASE_CODE = "USD";

    private String base;

    private String date;

    private String rates;

}
