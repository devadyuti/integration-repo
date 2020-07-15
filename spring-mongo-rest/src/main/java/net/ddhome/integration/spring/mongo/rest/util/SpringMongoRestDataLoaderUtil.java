package net.ddhome.integration.spring.mongo.rest.util;

import net.ddhome.integration.spring.mongo.rest.entity.User;
import net.ddhome.integration.spring.mongo.rest.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author devadyuti das
 */
@Component
public class SpringMongoRestDataLoaderUtil implements CommandLineRunner {
    private Logger log = LogManager.getLogger(SpringMongoRestDataLoaderUtil.class);

    @Autowired
    private UserService userService;

    public void run(String... strings) {
        userService.deleteCollection("user");

        userService.save(new User("John", "Smith", "john.smith@domain.com", true));
        userService.save(new User("John", "Holder", "john.holder@domain.com", true));
        userService.save(new User("Peter", "Smith", "peter.smith@domain.com", true));
        userService.save(new User("Willaim", "Holder", "william.holder@domain.com", true));
        userService.save(new User("Mark", "Taylor", "mark.taylor@domain.com", true));

        log.info("User found with findAll():");
        log.info("-------------------------------");
        for (User user : userService.findAll()) {
            log.info(user);
        }
    }
}
