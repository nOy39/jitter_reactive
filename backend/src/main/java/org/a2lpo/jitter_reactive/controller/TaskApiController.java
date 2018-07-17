package org.a2lpo.jitter_reactive.controller;

import org.a2lpo.jitter_reactive.entities.Task;
import org.a2lpo.jitter_reactive.repos.TaskRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskApiController {

    private final TaskRepo taskRepo;

    @Autowired
    public TaskApiController(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    private static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    private static final Logger LOG = LoggerFactory.getLogger(TaskApiController.class);

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

    @RequestMapping(path = "/tasks")
    public @ResponseBody List<Task> getAllTask() {
        return taskRepo.findAll();
    }
}
