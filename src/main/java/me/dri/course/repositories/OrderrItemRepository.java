package me.dri.course.repositories;

import me.dri.course.entities.Category;
import me.dri.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderrItemRepository extends JpaRepository<OrderItem, Long> {

}
