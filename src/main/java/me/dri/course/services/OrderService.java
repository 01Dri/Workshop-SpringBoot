package me.dri.course.services;

import me.dri.course.entities.Order;
import me.dri.course.repositories.OrderRepository;
import me.dri.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long Id) {
        Optional<Order> obj = repository.findById(Id);
        return obj.get();
    }
}
