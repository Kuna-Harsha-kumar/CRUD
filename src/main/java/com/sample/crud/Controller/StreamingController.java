package com.sample.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.crud.Service.StreamingService;

import reactor.core.publisher.Mono;

@RestController
public class StreamingController {
 
    @Autowired
    public StreamingService streaming;

    //api to get the video in the required chunks without loading the full data
    @GetMapping(value="/getVideo", produces="video/mp4")
    public Mono<Resource> getVideo(@RequestParam String title,
                               @RequestHeader(value = "Range", required = false) String range) {
    System.out.println("range: " + range);
    return streaming.getVideo(title);
}
}