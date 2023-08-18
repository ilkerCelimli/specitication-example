package com.portifolyo.speciticationexample.repository;

import com.portifolyo.speciticationexample.entity.Todo;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,String> {

    public List<Todo> findAll(Specification<Todo> spec);
    public List<Todo> findAll();

}
