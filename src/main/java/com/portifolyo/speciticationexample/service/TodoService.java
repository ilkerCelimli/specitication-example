package com.portifolyo.speciticationexample.service;

import com.portifolyo.speciticationexample.dto.TodoDto;
import com.portifolyo.speciticationexample.entity.Todo;
import com.portifolyo.speciticationexample.repository.TodoRepository;
import com.portifolyo.speciticationexample.repository.TodoSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;


    public List<Todo> todos(){
        return todoRepository.findAll(TodoSpecification.isDone());
    }
}
