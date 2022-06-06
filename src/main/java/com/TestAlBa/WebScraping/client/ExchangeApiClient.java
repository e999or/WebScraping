package com.TestAlBa.WebScraping.client;

import com.TestAlBa.WebScraping.rest.response.ExchangeFields;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "${app.feign.config.name}", url = "${app.feign.config.url}")
public interface ExchangeApiClient {

    @RequestMapping
            (method = RequestMethod.GET,value = "/latest.json?app_id=f2aa75f4b0f04ad9bcb2157a8e5fbd98")
    ExchangeFields readExchangeDataNow();

    @RequestMapping
            (method = RequestMethod.GET, value ="/historical/{date}.json?app_id=f2aa75f4b0f04ad9bcb2157a8e5fbd98")
    ExchangeFields readExchangeDataPast(@PathVariable("date") String date);


}
