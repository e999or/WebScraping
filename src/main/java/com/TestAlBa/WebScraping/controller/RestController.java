package com.TestAlBa.WebScraping.controller;

import com.TestAlBa.WebScraping.Clock;
import com.TestAlBa.WebScraping.client.ExchangeApiClient;
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
    private final ExchangeApiClient exchangeApiClient;
    final String date = Clock.date();


    @GetMapping
    public ResponseEntity readExchangeData
            (@RequestParam(required = false) Map<String, String> rates) {

        ResponseEntity<ExchangeFields> responseEntity = ResponseEntity.ok(exchangeApiClient.readExchangeDataNow());
        ExchangeFields eFNow = responseEntity.getBody();
        double usdNow = Double.parseDouble(eFNow.getRates().get("RUB"));
        System.out.println(usdNow);
//         поставить проверку на ноль

        ResponseEntity<ExchangeFields> responseEntity1 =  ResponseEntity.ok(exchangeApiClient.readExchangeDataPast(date));
        ExchangeFields eFPast = responseEntity1.getBody();
        double usdPast = Double.parseDouble(eFPast.getRates().get("RUB"));
        System.out.println(usdPast);

        if (usdNow > usdPast){

        }
        return responseEntity1;// возврат переделать
    }


}

