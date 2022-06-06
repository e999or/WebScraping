package com.TestAlBa.WebScraping.controller;

import com.TestAlBa.WebScraping.Clock;
import com.TestAlBa.WebScraping.client.ApiClient;
import com.TestAlBa.WebScraping.rest.response.ExchangeFields;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/exchange")
@RequiredArgsConstructor
public class RestController {
    private final ApiClient apiClient;
    String date = Clock.date();

    @GetMapping
    public ResponseEntity readExchangeData (@RequestParam(required = false)  String exchangeFields, Map<String, String> rates) {

        ResponseEntity<ExchangeFields> responseEntity =  ResponseEntity.ok(apiClient.readExchangeDataNow(exchangeFields, rates));
        ExchangeFields s = responseEntity.getBody();
        System.out.println(s.getRates().get("RUB"));
        // поставить проверку на ноль
//
//        ResponseEntity<ExchangeFields> responseEntity1 =  ResponseEntity.ok(apiClient.readExchangeDataPast(date, exchangeFields, rates));
//        ExchangeFields s = responseEntity1.getBody();
//        System.out.println(s.getRates().get("RUB"));
//        return responseEntity1;
        return responseEntity;
    }

}

