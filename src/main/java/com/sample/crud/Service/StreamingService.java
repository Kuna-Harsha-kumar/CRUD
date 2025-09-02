package com.sample.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class StreamingService {
    
    // correct folder name (resources/videos/)
    private static final String FORMAT = "classpath:static/videos/%s.mp4";

    @Autowired
    private ResourceLoader resourceLoader;

    //loading the video in chunks
    public Mono<Resource> getVideo(String title) {
    return Mono.fromSupplier(() -> 
        resourceLoader.getResource(String.format(FORMAT, title))
    );
}
}