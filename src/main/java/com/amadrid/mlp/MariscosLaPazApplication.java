package com.amadrid.mlp;

import com.amadrid.mlp.model.User;
import com.amadrid.mlp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MariscosLaPazApplication {

    public static void main(String[] args) {
        SpringApplication.run(MariscosLaPazApplication.class, args);


    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepo) {
        return args -> {
            userRepo.save(new User("09098426V", "Álvaro", "Madrid", "amadridf94@gmail.com"));
            userRepo.save(new User("02292668M", "Sandra", "Cerro", "sankiry93@gmail.com"));

            // Find all Users
            for (User user : userRepo.findAll()) {
                System.out.println(user.getId());
            }

            // Find User by ID
            User san = userRepo.findById("02292668M");
            System.out.println(san.getEmail());

            for (User user : userRepo.findUserByIdContaining("%66%")) {
                System.out.println(user.getName() + ' ' + user.getSurname());
            }
        };
    }


}
