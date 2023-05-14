package me.dri.course.services;

import me.dri.course.entities.Category;
import me.dri.course.entities.Product;
import me.dri.course.repositories.CategoryRepository;
import me.dri.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long Id) {
        Optional<Product> obj = repository.findById(Id);
        return obj.get();
    }
}
