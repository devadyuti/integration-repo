package net.ddhome.integration.spring.mongo.rest.repository;

import net.ddhome.integration.spring.mongo.rest.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author devadyuti das
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public List<User> findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);
}
