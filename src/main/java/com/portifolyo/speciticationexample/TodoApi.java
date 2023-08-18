package com.portifolyo.speciticationexample;

import com.portifolyo.speciticationexample.entity.Todo;
import com.portifolyo.speciticationexample.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TodoApi {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        return ResponseEntity.ok(this.todoService.todos());
    }
}
