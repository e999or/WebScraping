package com.TestAlBa.WebScraping.controller;

import com.TestAlBa.WebScraping.client.GifApiClient;
import com.TestAlBa.WebScraping.rest.response.GifFields;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/gif")
@RequiredArgsConstructor
public class RestControllerGif {

    private final GifApiClient gifApiClient;
    final String tag = "rich";

    @GetMapping
    public ResponseEntity readGif (@RequestParam(required = false) Map< String, String > meta){
        ResponseEntity<GifFields> responseEntityGif = ResponseEntity.ok(gifApiClient.readGifDataNow(tag));

        return responseEntityGif;

    }
}
