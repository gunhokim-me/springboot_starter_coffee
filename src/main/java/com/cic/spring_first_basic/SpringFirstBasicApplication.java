package com.cic.spring_first_basic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


import java.util.UUID;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringFirstBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFirstBasicApplication.class, args);
    }
}

@Entity
class Coffee {
    @Id
    private String id;
    private String name;

    public Coffee() {}

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
