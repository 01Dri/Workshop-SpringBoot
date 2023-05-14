package me.dri.course.repositories;

import me.dri.course.entities.Category;
import me.dri.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
