package me.dri.course.services;

import me.dri.course.entities.Category;
import me.dri.course.entities.User;
import me.dri.course.repositories.CategoryRepository;
import me.dri.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long Id) {
        Optional<Category> obj = repository.findById(Id);
        return obj.get();
    }
}
