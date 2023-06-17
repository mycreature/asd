package com.team01.db_project_team01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class DbProjectTeam01Application {

    public static void main(String[] args) {
        SpringApplication.run(DbProjectTeam01Application.class, args);
    }

}
