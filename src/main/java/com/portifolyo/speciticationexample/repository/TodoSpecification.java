package com.portifolyo.speciticationexample.repository;

import com.portifolyo.speciticationexample.entity.Todo;
import jakarta.persistence.criteria.Expression;
import org.springframework.data.jpa.domain.Specification;

public class TodoSpecification {

    public static Specification<Todo> eqTitle(String title){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("title"),title));
    }

    public static Specification<Todo> eqTodo(String todo){
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("todo"),todo);
    }

    public static Specification<Todo> isDone(){
        return (root, query, criteriaBuilder) -> criteriaBuilder.isTrue(root.get("isDone"));
    }


}
