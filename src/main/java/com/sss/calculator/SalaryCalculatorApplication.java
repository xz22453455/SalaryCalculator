package com.sss.calculator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.sss.calculator.dao")
@EnableScheduling
public class SalaryCalculatorApplication {
    public static void main(String[] args) {

        SpringApplication.run(SalaryCalculatorApplication.class, args);

    }

}

