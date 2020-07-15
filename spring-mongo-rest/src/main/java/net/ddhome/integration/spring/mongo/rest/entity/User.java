package net.ddhome.integration.spring.mongo.rest.entity;

import org.springframework.data.annotation.Id;

/**
 * @author devadyuti das
 */
public class User {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private boolean verified;

    public User() {
    }

    public User(String id, String firstName, String lastName,
                String email, boolean verified) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.verified = verified;
    }

    public User(String firstName, String lastName, String email,
                boolean verified) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.verified = verified;
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User [id=%s, firstName=%s, lastName=%s, email=%s]", id, firstName, lastName, email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
