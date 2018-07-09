package org.a2lpo.jitter_reactive.controller;

import org.a2lpo.jitter_reactive.entities.User;
import org.a2lpo.jitter_reactive.repos.UserRepo;
import org.a2lpo.jitter_reactive.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BackController {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserService userService;

    private static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    private static final Logger LOG = LoggerFactory.getLogger(BackController.class);

    @RequestMapping(path = "/hello")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody User getAllUser() {
        List<User> all = userRepo.findAll();
        User admin = userRepo.findByUsername("admin");
        return admin;
    }
}
