package com.amadrid.mlp.repository;

import com.amadrid.mlp.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findById(String id);

    User findByPhoneNumber(String phoneNumber);

    List<User> findByNameAndSurname(String name, String surname);

    List<User> findByName(String name);

    @Query(value = "SELECT  * FROM user u WHERE u.id LIKE :id", nativeQuery = true)
    List<User> findUserByIdContaining(@Param("id") String id);
}
