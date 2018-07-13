package org.a2lpo.jitter_reactive.controller;

import org.a2lpo.jitter_reactive.entities.Category;
import org.a2lpo.jitter_reactive.entities.Task;
import org.a2lpo.jitter_reactive.repos.GroupRepo;
import org.a2lpo.jitter_reactive.repos.TaskRepo;
import org.a2lpo.jitter_reactive.repos.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class ApiController {

    private final TaskRepo taskRepo;
    private final GroupRepo groupRepo;

    @Autowired
    public ApiController(
            TaskRepo taskRepo,
            GroupRepo groupRepo) {
        this.taskRepo = taskRepo;
        this.groupRepo = groupRepo;
    }

    private static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping(path = "/hello")
    public @ResponseBody
    String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

    @RequestMapping(path = "/get/task", method = RequestMethod.GET)
    public @ResponseBody
    List<Task> getAllTask() {
        return taskRepo.findAll();
    }

    @RequestMapping(path = "/get/group", method = RequestMethod.GET)
    public @ResponseBody
    List<Category> getAllCategories() {
        return groupRepo.findAll();
    }

}
