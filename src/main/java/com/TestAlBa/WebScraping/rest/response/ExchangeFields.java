package com.TestAlBa.WebScraping.rest.response;

import lombok.Data;
import java.util.Map;

@Data
public class ExchangeFields {

    private String disclaimer;
    private String license;
    private String timestamp;
    private String base;
    private Map<String, String> rates;

}
