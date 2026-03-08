package me.noalibi99.springmvcapp;

import me.noalibi99.springmvcapp.entities.Product;
import me.noalibi99.springmvcapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringMvcAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(5400)
                    .quantity(12)
                    .build());
            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(1200)
                    .quantity(11)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smart Phone")
                    .price(1200)
                    .quantity(12)
                    .build());
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(12000)
                    .quantity(10)
                    .build());
            productRepository.findAll().forEach(System.out::println);
        };
    }
}
