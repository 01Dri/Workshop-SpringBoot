package me.dri.course.repositories;

import me.dri.course.entities.Category;
import me.dri.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
