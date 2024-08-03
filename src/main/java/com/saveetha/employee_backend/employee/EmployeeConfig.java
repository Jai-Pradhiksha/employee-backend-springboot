package com.saveetha.employee_backend.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            Employee jai = new Employee(
                    "Jai",
                    LocalDate.of(2003, Month.NOVEMBER,28),
                    "jai@example.com"
            );

            Employee sai = new Employee(
                    "Sai",
                    LocalDate.of(2004,Month.JANUARY,9),
                    "sai@example.com"
            );
            employeeRepository.saveAll(List.of(jai,sai));
        };
    }
}
