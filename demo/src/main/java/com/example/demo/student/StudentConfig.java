package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//import static sun.util.calendar.BaseCalendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marism = new Student(

                    "Marism",
                    "marisam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );
            Student alex = new Student(

                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5),
                    21
            );
            repository.saveAll(
                    List.of(marism, alex)
            );

        };
    }
}
