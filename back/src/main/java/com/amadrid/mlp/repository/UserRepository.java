package com.amadrid.mlp.repository;

import com.amadrid.mlp.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "user")
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findById(String id);

    @RestResource(path = "phone")
    User findByPhoneNumber(String phoneNumber);

    List<User> findByNameAndSurname(String name, String surname);

    List<User> findByName(String name);

    @Query(value = "SELECT  * FROM user u WHERE u.id LIKE :id", nativeQuery = true)
    List<User> findUserByIdContaining(@Param("id") String id);
}
