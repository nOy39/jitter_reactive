package org.a2lpo.jitter_reactive.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController()
@RequestMapping("/api")
public class RestController {

    private static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    private static final Logger LOG = LoggerFactory.getLogger(RestController.class);

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }
}
