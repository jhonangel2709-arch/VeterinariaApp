package com.veterinaria.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controlador", "servicio"})
public class VeterinariaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeterinariaAppApplication.class, args);
    }
}

