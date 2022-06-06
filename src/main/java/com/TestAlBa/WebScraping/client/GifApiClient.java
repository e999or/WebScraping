package com.TestAlBa.WebScraping.client;

import com.TestAlBa.WebScraping.rest.response.GifFields;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "gif-api", url = "https://api.giphy.com/v1/gifs/")
public interface GifApiClient {

    @RequestMapping
            (method = RequestMethod.GET,value = "/random?api_key=9ekhBW8jmXb47DiBR65QvezW10qXlszE&tag={tag}&rating=g")
    GifFields readGifDataNow(@PathVariable("tag") String tag);
}
