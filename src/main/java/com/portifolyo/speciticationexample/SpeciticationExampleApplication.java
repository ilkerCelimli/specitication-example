package com.portifolyo.speciticationexample;

import com.portifolyo.speciticationexample.entity.Todo;
import com.portifolyo.speciticationexample.entity.User;
import com.portifolyo.speciticationexample.repository.TodoRepository;
import com.portifolyo.speciticationexample.repository.UserRepository;
import com.portifolyo.speciticationexample.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpeciticationExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeciticationExampleApplication.class, args);
    }

}

