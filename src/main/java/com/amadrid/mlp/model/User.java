package com.amadrid.mlp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity // JPA entity -> Mapped to a User table in DB
@AllArgsConstructor
@NoArgsConstructor
@Data public class User {

    @Id private String  id;
    private String name;
    private String surname;
    private String email;;
    private Date birthDate;
    private String phoneNumber;

    public User (String id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
