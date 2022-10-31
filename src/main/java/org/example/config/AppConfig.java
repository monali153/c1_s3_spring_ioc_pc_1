package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {


    @Bean("emp")
    public Employee getEmp(){

        Employee emp = new Employee();
        emp.setEmpId(200);
        emp.setEmpName("John");
        emp.setSalary("50000");
        return emp;
    }

    @Bean
    public Department getDept(){

        return new Department(01,"Finance");
    }
}
