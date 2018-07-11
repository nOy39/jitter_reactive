package org.a2lpo.jitter_reactive.controller;

import org.a2lpo.jitter_reactive.repos.TaskRepo;
import org.a2lpo.jitter_reactive.repos.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class ApiController {

    private final TaskRepo taskRepo;

    @Autowired
    public ApiController(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    private static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping(path = "/hello")
    public @ResponseBody
    String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

}
