package net.ddhome.integration.spring.mongo.rest.service;

import net.ddhome.integration.spring.mongo.rest.entity.User;
import net.ddhome.integration.spring.mongo.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author devadyuti das
 */
@EnableMongoRepositories(basePackages = {"net.ddhome.integration.spring.mongo.rest.repository"})
@Service
public class UserService extends BaseEntityService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public List<User> findByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }
}
