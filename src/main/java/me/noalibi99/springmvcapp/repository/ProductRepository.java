package me.noalibi99.springmvcapp.repository;

import me.noalibi99.springmvcapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
