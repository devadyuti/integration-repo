package net.ddhome.integration.spring.mongo.rest.controller;

import net.ddhome.integration.spring.mongo.rest.entity.User;
import net.ddhome.integration.spring.mongo.rest.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author devadyuti das
 */
@RestController
@RequestMapping("/integration")
public class SpringMongoRestController {
    private Logger log = LogManager.getLogger(SpringMongoRestController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "/userList")
    public List<User> getUserList() {
        List<User> userList = userService.findAll();
        log.info("User " + userList);

        return userList;
    }

    @GetMapping(value = "/userListByFirstName/{firstName}")
    public List<User> getUserListByFirstName(@PathVariable String firstName) {
        List<User> userList = userService.findByFirstName(firstName);
        log.info("User " + userList);

        return userList;
    }

    @GetMapping(value = "/userListByLastName/{lastName}")
    public List<User> getUserListByLastName(@PathVariable String lastName) {
        List<User> userList = userService.findByLastName(lastName);
        log.info("User " + userList);

        return userList;
    }
}
