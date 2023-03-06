package com.steven.cns.ddd.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: steven
 * @date: 2023/3/5 15:31
 */
@Slf4j
@ComponentScan(basePackages = {"com.steven"})
@SpringBootApplication
public class CnsDddApplication {
    public static void main(String[] args) {
        SpringApplication.run(CnsDddApplication.class, args);
    }
}
