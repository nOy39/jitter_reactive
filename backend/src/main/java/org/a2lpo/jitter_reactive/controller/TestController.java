package org.a2lpo.jitter_reactive.controller;

import org.a2lpo.jitter_reactive.entities.User;
import org.a2lpo.jitter_reactive.repos.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class TestController {
    private final UserRepo userRepo;

    private static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    public TestController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

    @RequestMapping(path = "/users")
    public @ResponseBody List<User> getHello() {
        return userRepo.findAll();
    }
}
